package com.example.xhawproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Signin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val edtEmail = findViewById<TextView>(R.id.edtEmail)
        val edtPass = findViewById<TextView>(R.id.edtPass)
        val edtConPass = findViewById<TextView>(R.id.edtConPass)
        val btnConfirm1 = findViewById<Button>(R.id.btnConfirm1)

        btnConfirm1.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPass.text.toString()
            val confirmPassword = edtConPass.text.toString()

            val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()
            var isValid = true


            if (!emailRegex.matches(email)) {
                Toast.makeText(this@Signin, "Invalid email format", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (password.length < 6) {
                Toast.makeText(this@Signin, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (password != confirmPassword) {
                Toast.makeText(this@Signin, "Passwords do not match.", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (isValid) {
                Toast.makeText(this@Signin, "Welcome to the app", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,homepage::class.java)
                startActivity(intent)
            }
        }
    }
}