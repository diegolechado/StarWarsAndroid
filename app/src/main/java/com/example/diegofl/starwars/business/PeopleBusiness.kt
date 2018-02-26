package com.example.diegofl.starwars.business

import com.example.diegofl.starwars.data.model.response.People
import com.example.diegofl.starwars.data.repository.RetrofitInitializer
import com.example.diegofl.starwars.infrastructure.OperationResult
import retrofit2.Response

/**
 * Created by diegofl on 21/02/18.
 */

class PeopleBusiness{

    fun getPeople() : OperationResult<List<People>> {

        val operationResult = OperationResult<List<People>>()
        val response = RetrofitInitializer().starWarsService().getPeople().execute()

        if(response.isSuccessful && response.body() != null){
            operationResult.operationType = OperationResult.ResultType.SUCCESS
            operationResult.resultValue = response.body()!!.results
        }

        return operationResult
    }
}
