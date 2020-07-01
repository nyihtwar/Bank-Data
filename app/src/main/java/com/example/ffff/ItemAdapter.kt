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
        holder.itemView.rate_item.text="US Dollar = ${rate.USD} Kyats"+"\n"+"Chinese Yann = ${rate.CNY} Kyats"+"\n"+"Swiss Franc = ${rate.CHF} Kyats"+"\n"+"Sir Lanka Rupee = ${rate.LKR} Kyats"+
                "\n"+"New Zealand Dollar  = ${rate.NZD} Kyats"+"\n"+"South Korea Won = ${rate.KRW} Kyats"+"\n"+"Egyptian Pound = ${rate.EGP} Kyats"+
                "\n"+"Vietnamese Dong = ${rate.VND} Kyats"+"\n"+"Bangladeshi Taka = ${rate.BDT} Kyats"+"\n"+"Philippine Peso = ${rate.PHP} Kyats"+"\n"+"Indonesian Rupiah = ${rate.IDR} Kyats"+"\n"+
                "Cambodian Riel = ${rate.KHR} Kyats"+"\n"+"Serbian Dinar = ${rate.RSD} Kyats"+"\n"+"Singapore Dollar = ${rate.SGD} Kyats"+"\n"+"Malaysian Riggit = ${rate.MYR} Kyats"+"\n"+
                "Czech Koruna = ${rate.CZK} Kyats"+"\n"+"Swedish Krona = ${rate.SEK} Kyats"+"\n"+"Japanese Yen = ${rate.JPY} Kyats"+"\n"+"Norwegian Kroner = ${rate.NOK} Kyats"+"\n"+
                "Israeli New Shekel = ${rate.ILS} Kyats"+"\n"+"Russian Rouble = ${rate.RUB} Kyats"+"\n"+"Kuwaiti Dinar = ${rate.KWD} Kyats"+"\n"+"Hong Kong Dollar = ${rate.HKD} Kyats"+"\n"+
                "Brazilian Rea = ${rate.BRL} Kyats"+"\n"+"Canadian Dollar = ${rate.CAD} Kyats"+"\n"+"South African Rand = ${rate.ZAR} Kyats"+"\n"+"British Pound = ${rate.GBP} Kyats"+"\n"+
                "Nepalese Rupee = ${rate.NPR} Kyats"+"\n"+"Kenyan Shilling = ${rate.KES} Kyats"+"\n"+"Danish Krone = ${rate.DKK} Kyats"+"\n"+"Thai Baht = ${rate.THB} Kyats"+"\n"+
                "Australian Dollar = ${rate.AUD} Kyats"+"\n"+"Pakistan Rupee = ${rate.PKR} Kyats"+"\n"+"Brunei Dollar = ${rate.BND} Kyats"+"\n"+"Saudi Riyal = ${rate.SAR} Kyats"+"\n"+
                "Euro = ${rate.EUR} Kyats"+"\n"+"Lao Kip = ${rate.LAK} Kyats"+"\n"+"Indian Rupee = ${rate.INR} Kyats"+"\n"


    }
}