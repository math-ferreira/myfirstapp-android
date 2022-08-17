package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val txHello = findViewById<TextView>(R.id.myTextView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            txHello.text = timesClicked.toString()
            Toast.makeText(this, "Hey Matheus", Toast.LENGTH_LONG).show()
        }
    }
}