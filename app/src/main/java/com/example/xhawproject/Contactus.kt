package com.example.xhawproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Contactus : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactus)

        val btnBack1 = findViewById<Button>(R.id.btnBack1)

        btnBack1.setOnClickListener {
            val intent = Intent(this,homepage ::class.java)
            startActivity(intent)
        }
    }
}