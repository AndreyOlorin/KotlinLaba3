package com.example.kotlinlaba3

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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

        button.setOnClickListener(){

            val yourNumber = findViewById<EditText>(R.id.yourNumber)
            val yourSymbol = findViewById<EditText>(R.id.yourSymbol)

            if (yourNumber.text.toString() == ""){
                yourNumber.setText("0")
            }

            // || yourNumber.text.toString().toInt() == 0
            if (yourNumber.text.toString().toInt() > editString.text.length  || yourNumber.text.toString() == ""){
                Toast.makeText(this, "Число больше изменяемой строки", Toast.LENGTH_SHORT).show()
            }
            else{
                val newString  = yourSymbol.text.toString().repeat(yourNumber.text.toString().toInt())
                editString.text = editString.text.substring(newString.length)
                editString.text = newString + editString.text
            }
                //2
        }
    }
}