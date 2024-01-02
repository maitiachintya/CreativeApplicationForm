package com.example.creativeapplicationform

import retrofit2.http.GET

interface ApiInterface {
    @GET("api/users")
    suspend fun getquotes(): retrofit2.Response<ModelClass>
}