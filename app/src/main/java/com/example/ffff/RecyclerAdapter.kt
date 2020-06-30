package com.example.ffff

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ffff.getData.Bank
import kotlinx.android.synthetic.main.item.view.*

class RecyclerAdapter(val context:Context,val banks:Bank):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    class ViewHolder(item: View):RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false))
    }

    override fun getItemCount(): Int=1

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bank=banks
        holder.itemView.tv_info.text="Information:"+bank.info
        holder.itemView.tv_des.text="Description:"+bank.description
        holder.itemView.tv_time.text="Time Stamp:"+bank.timestamp
        holder.itemView.tv_rate.text="\n"+bank.rates
    }
}