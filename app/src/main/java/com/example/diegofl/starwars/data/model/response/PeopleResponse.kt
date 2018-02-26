package com.example.diegofl.starwars.data.model.response

/**
 * Created by diegofl on 21/02/18.
 */

data class PeopleResponse(
        val count: Int,
        val next: String,
        val previous: Any,
        val results: List<People>
)