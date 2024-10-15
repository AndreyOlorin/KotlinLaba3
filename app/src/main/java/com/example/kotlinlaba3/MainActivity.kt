package com.example.kotlinlaba3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.startButton)
        val editString = findViewById<TextView>(R.id.editString)
        val yourNumber = findViewById<EditText>(R.id.yourNumber)
        val yourSymbol = findViewById<EditText>(R.id.yourSymbol)

        button.setOnClickListener(){

        }
    }
}