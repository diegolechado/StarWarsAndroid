package com.example.diegofl.starwars.data.repository

import com.example.diegofl.starwars.data.model.response.People
import com.example.diegofl.starwars.data.model.response.PeopleResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by diegofl on 21/02/18.
 */
interface StarWarsService {

    @GET("films")
    fun getFilms()

    @GET("people")
    fun getPeople() : Call<PeopleResponse>

    @GET("planets")
    fun getPlanets()

}