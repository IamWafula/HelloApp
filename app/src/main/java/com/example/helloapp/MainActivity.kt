package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            Log.v("Hello App", "The Button was clicked")
            Toast.makeText(this, "Hi to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}