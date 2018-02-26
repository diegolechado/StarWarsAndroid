package com.example.diegofl.starwars.manager

import android.content.Context
import android.os.AsyncTask
import com.example.diegofl.starwars.business.PeopleBusiness
import com.example.diegofl.starwars.data.model.response.People
import com.example.diegofl.starwars.infrastructure.OperationListener
import com.example.diegofl.starwars.infrastructure.OperationResult
import com.example.diegofl.starwars.infrastructure.OperationResult.*

/**
 * Created by diegofl on 21/02/18.
 */
class PeopleManager {
    fun getPeople(context: Context, callback: OperationListener<List<People>>){

        val peopleBusiness = PeopleBusiness()

        class PeopleAsyncTask: AsyncTask<Void, Int, OperationResult<List<People>>>(){
            override fun doInBackground(vararg p0: Void?): OperationResult<List<People>> {
                return peopleBusiness.getPeople()
            }

            override fun onPostExecute(result: OperationResult<List<People>>?) {
                if(result != null && result.operationType == ResultType.SUCCESS && result.resultValue != null){
                    callback.onSuccess(result.resultValue!!)
                }else{
                    //callback.onError()
                }
            }
        }

        PeopleAsyncTask().execute()
    }
}