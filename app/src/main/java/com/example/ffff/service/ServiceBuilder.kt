package com.example.ffff.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {

    private const val BASE_URL="https://forex.cbm.gov.mm/api/"
    private  val Okhttp:OkHttpClient.Builder=OkHttpClient.Builder()
    private val builder:Retrofit.Builder=Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(Okhttp.build())

    private val retrofit:Retrofit= builder.build()

    fun <T> buildService(serviceType:Class<T>):T{
        return retrofit.create(serviceType)
    }


}