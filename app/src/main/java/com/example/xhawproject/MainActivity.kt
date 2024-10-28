package com.example.xhawproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSignin = findViewById<Button>(R.id.btnSignin)

        btnSignin.setOnClickListener {
            val intent = Intent(this,Signin::class.java)
            startActivity(intent)

        }
    }
}