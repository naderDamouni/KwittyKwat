package com.example.kwittykwat.api

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET

interface API {
    @GET("/v1/images/search")
    suspend fun getImages(): Response<ResponseBody>

}

fun getMethod() {

    // Create Retrofit
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.thecatapi.com")
        .build()

    // Create Service
    val service = retrofit.create(API::class.java)

    CoroutineScope(Dispatchers.IO).launch {
        val response = service.getImages()

        withContext(Dispatchers.Main) {
            if (response.isSuccessful) {
                Log.d("Image Data :", response.toString())
            } else {
                Log.e("Retrofit Error", response.code().toString())
            }
        }
    }

}
