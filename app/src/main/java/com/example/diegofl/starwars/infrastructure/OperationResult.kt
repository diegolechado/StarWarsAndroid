package com.example.diegofl.starwars.infrastructure

/**
 * Created by diegofl on 21/02/18.
 */

class OperationResult<T>{

    enum class ResultType{
        SUCCESS, ERROR
    }

    var resultValue: T? = null
    var error: Error? = null
    var operationType: ResultType = ResultType.ERROR
}