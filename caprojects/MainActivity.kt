package com.example.caprojects

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.name)
        val city1= findViewById<EditText>(R.id.city)
        val city2=findViewById<EditText>(R.id.destination)
        val search = findViewById<Button>(R.id.search)
        val Login= findViewById<Button>(R.id.login)

        search.setOnClickListener{
            val intent = Intent(this, searching::class.java)
            var descity=city2.text.toString()

           intent.putExtra("dest",descity)
            startActivity(intent)
        }
        Login.setOnClickListener {
            val intent = Intent(this, form::class.java)
            startActivity(intent)

        }}
}

