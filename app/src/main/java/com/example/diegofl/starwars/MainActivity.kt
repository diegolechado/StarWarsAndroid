package com.example.diegofl.starwars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.diegofl.starwars.data.model.response.People
import com.example.diegofl.starwars.infrastructure.OperationListener
import com.example.diegofl.starwars.infrastructure.OperationResult

import com.example.diegofl.starwars.manager.PeopleManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = PeopleManager()
        manager.getPeople(this, object : OperationListener<List<People>> {
            override fun onPreExecute(result: List<People>) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSuccess(result: List<People>) {
                Toast.makeText(applicationContext, "FOIIII", Toast.LENGTH_LONG).show()
            }

            override fun onCancel() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onPostExecute() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProgressUpdate(progress: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

    }
}
