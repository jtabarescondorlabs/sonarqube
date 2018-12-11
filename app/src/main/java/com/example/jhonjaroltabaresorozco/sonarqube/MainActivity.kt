package com.example.jhonjaroltabaresorozco.sonarqube

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        returnIf()
    }

    private fun returnIf(): Boolean{
        if("hola" == ""){
            return true
        }else{
            return false
        }

        return true

    }
}


