package com.example.intents2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent=findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener {
            //open a new activity


            intent= Intent(applicationContext, secondActivity::class.java)
            startActivity(intent)
        }


    }
}