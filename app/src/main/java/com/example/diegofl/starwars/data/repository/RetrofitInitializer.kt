package com.example.diegofl.starwars.data.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by diegofl on 21/02/18.
 */
class RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
            .baseUrl("https://swapi.co/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun starWarsService() = retrofit.create(StarWarsService::class.java)
}