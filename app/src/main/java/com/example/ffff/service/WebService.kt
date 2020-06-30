package com.example.ffff.service

import com.example.ffff.getData.Bank
import retrofit2.Call
import retrofit2.http.GET

interface WebService {

    @GET("latest")
    fun getData():Call<Bank>
}