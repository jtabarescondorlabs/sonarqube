package com.example.jhonjaroltabaresorozco.sonarqube

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        returnIf()
    }

    private fun returnIf(): Int{

        val count : Int

        count=+4

        if("hola" == ""){
            return count
        }else{
            return count
        }

        return count
    }

}


