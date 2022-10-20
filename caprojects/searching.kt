package com.example.caprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class searching : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching)
        val des=findViewById<TextView>(R.id.des_text)
        val cost = findViewById<TextView>(R.id.cost_text)
        val dist= findViewById<TextView>(R.id.distance)
        val pay= findViewById<Button>(R.id.pay)
        var dest= intent.getStringExtra("dest")

pay.setOnClickListener {
    Toast.makeText(it.context,"processing...",Toast.LENGTH_LONG).show()
}

        des.text= intent.getStringExtra("dest")


    }
}