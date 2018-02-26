package com.example.diegofl.starwars.infrastructure

/**
 * Created by diegofl on 21/02/18.
 */
interface OperationListener<TResult> {

    fun onPreExecute(result: TResult)

    fun onSuccess(result: TResult)

    //fun onError(error: OperationError)

    fun onCancel()

    fun onPostExecute()

    fun onProgressUpdate(progress: Int)

}