package com.example.spotify

import MyData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
       @Headers("X-RapidAPI-Key: dc37cba981msh04962f04d1ea042p12701cjsn528b70cfb5f5" ,
               "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
        @GET("search")


        fun getData(@Query("q") query: String ) : Call<MyData>

}

