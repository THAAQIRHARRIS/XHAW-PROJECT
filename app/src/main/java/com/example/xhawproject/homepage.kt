package com.example.xhawproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homepage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        val btnCourses = findViewById<Button>(R.id.btnCourses)
        val btnContact = findViewById<Button>(R.id.btnContact)

        btnContact.setOnClickListener {
            val intent = Intent(this,Contactus ::class.java)
            startActivity(intent)

        }

        btnCourses.setOnClickListener {
            val intent = Intent(this,details ::class.java)
            startActivity(intent)
        }
    }
}