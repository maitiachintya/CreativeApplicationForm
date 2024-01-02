package com.example.creativeapplicationform

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val baseurl = "https://reqres.in/"
    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseurl).addConverterFactory(GsonConverterFactory.create()).build()
    }
}