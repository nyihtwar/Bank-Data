package com.example.ffff

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ffff.getData.Bank
import com.example.ffff.service.ServiceBuilder
import com.example.ffff.service.WebService
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import org.jetbrains.anko.verticalLayout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager=LinearLayoutManager(this)
        getAllData()

    }

    private fun getAllData(){
        val service=ServiceBuilder.buildService(WebService::class.java)
        val responseData:Call<Bank> = service.getData()

        responseData.enqueue(object :Callback<Bank>{
            override fun onFailure(call: Call<Bank>, t: Throwable) {
                Log.d("msg",t.message!!)
            }

            override fun onResponse(call: Call<Bank>, response: Response<Bank>) {
                if (response.isSuccessful){
                    val dataList= response.body()!!
                    recycler_view.adapter=RecyclerAdapter(this@MainActivity,dataList)
                    Log.d("msg",dataList.toString())
                    var dbManager=DbManager(this@MainActivity)
                    var values= ContentValues()

                    values.put("Info",dataList.info)
                    values.put("Des",dataList.description)
                    values.put("Time",dataList.timestamp)
                    values.put("Rate",dataList.rates.toString())

                    val ID=dbManager.dataInsert(values)
                    if(ID>0){
                        Toast.makeText(this@MainActivity,"Inserted Data   $values", Toast.LENGTH_LONG).show()

                    }else{
                        Toast.makeText(this@MainActivity,"cannot add note", Toast.LENGTH_SHORT).show()
                    }


                }else {
                    Log.d("msg","fial")
                }

            }

        })
    }
}