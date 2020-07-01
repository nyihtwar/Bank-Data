package com.example.ffff

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ffff.getData.Rate
import kotlinx.android.synthetic.main.rate_item.view.*

class ItemAdapter (val context: Context, val rates: Rate):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    class ViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.rate_item,parent,false))
    }

    override fun getItemCount(): Int=1

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val rate=rates
        holder.itemView.rate_item.text="US Dollar is ${rate.USD} Kyats"+"\n"+"Chinese Yann is ${rate.CNY} Kyats"+"\n"+"Swiss Franc is ${rate.CHF} Kyats"+"\n"+"Sir Lanka Rupee is ${rate.LKR} Kyats"+
                "\n"+"New Zealand Dollar  is ${rate.NZD} Kyats"+"\n"+"South Korea Won is ${rate.KRW} Kyats"+"\n"+"Egyptian Pound is ${rate.EGP} Kyats"+
                "\n"+"Vietnamese Dong is ${rate.VND} Kyats"+"\n"+"Bangladeshi Taka is ${rate.BDT} Kyats"+"\n"+"Philippine Peso is ${rate.PHP} Kyats"+"\n"+"Indonesian Rupiah is ${rate.IDR} Kyats"+"\n"+
                "Cambodian Riel is ${rate.KHR} Kyats"+"\n"+"Serbian Dinar is ${rate.RSD} Kyats"+"\n"+"Singapore Dollar is ${rate.SGD} Kyats"+"\n"+"Malaysian Riggit is ${rate.MYR} Kyats"+"\n"+
                "Czech Koruna is ${rate.CZK} Kyats"+"\n"+"Swedish Krona is ${rate.SEK} Kyats"+"\n"+"Japanese Yen is ${rate.JPY} Kyats"+"\n"+"Norwegian Kroner is ${rate.NOK} Kyats"+"\n"+
                "Israeli New Shekel is ${rate.ILS} Kyats"+"\n"+"Russian Rouble is ${rate.RUB} Kyats"+"\n"+"Kuwaiti Dinar is ${rate.KWD} Kyats"+"\n"+"Hong Kong Dollar is ${rate.HKD} Kyats"+"\n"+
                "Brazilian Rea is ${rate.BRL} Kyats"+"\n"+"Canadian Dollar is ${rate.CAD} Kyats"+"\n"+"South African Rand is ${rate.ZAR} Kyats"+"\n"+"British Pound is ${rate.GBP} Kyats"+"\n"+
                "Nepalese Rupee is ${rate.NPR} Kyats"+"\n"+"Kenyan Shilling is ${rate.KES} Kyats"+"\n"+"Danish Krone is ${rate.DKK} Kyats"+"\n"+"Thai Baht is ${rate.THB} Kyats"+"\n"+
                "Australian Dollar is ${rate.AUD} Kyats"+"\n"+"Pakistan Rupee is ${rate.PKR} Kyats"+"\n"+"Brunei Dollar is ${rate.BND} Kyats"+"\n"+"Saudi Riyal is ${rate.SAR} Kyats"+"\n"+
                "Euro is ${rate.EUR} Kyats"+"\n"+"Lao Kip is ${rate.LAK} Kyats"+"\n"+"Indian Rupee is ${rate.INR} Kyats"+"\n"


    }
}