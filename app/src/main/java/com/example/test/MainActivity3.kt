package com.example.test

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var intent = intent
        val date = intent.getStringExtra("Date")
        val room = intent.getStringExtra("Room")
        val roomNumber = intent.getSerializableExtra("roomNumber").toString()

        val resultTv = findViewById<TextView>(R.id.tvResult)

        resultTv.text = "Date : "+ roomNumber

    }
}