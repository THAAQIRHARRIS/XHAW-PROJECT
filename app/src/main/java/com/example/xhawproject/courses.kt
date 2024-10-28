package com.example.xhawproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class courses : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val edtName = findViewById<TextView>(R.id.edtName)
        val spnCourse = findViewById<Spinner>(R.id.spnCourse)
        val spnTime = findViewById<Spinner>(R.id.spnTime)
        val edtBank = findViewById<TextView>(R.id.edtBank)
        val edtCVC = findViewById<TextView>(R.id.edtCVC)
        val edtNumber = findViewById<TextView>(R.id.edtNumber)
        val btnBack2 = findViewById<Button>(R.id.btnBack2)
        val btnConfirm2 = findViewById<Button>(R.id.btnConfirm2)
        val btnCancel = findViewById<Button>(R.id.btnCancel)

        val courses = arrayOf("Select Course", "Cooking:Six-weeks", "Gardening:Six-months", "Washing:Six-weeks","Home safety:Six-months")
        spnCourse.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, courses)

        val time = arrayOf("Select", "Part time", "Full time")
        spnTime.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, time)


        btnBack2.setOnClickListener {
            val intent = Intent(this,details ::class.java)
            startActivity(intent)

        }
        btnConfirm2.setOnClickListener {

            var Name = edtName.text.toString()
            var Course = spnCourse.selectedItem.toString()
            var Time = spnTime.selectedItem.toString()
            var Bank = edtBank.text.toString()
            var CVC = edtCVC.text.toString()
            var Number = edtNumber.text.toString()



            if (Name.isNotEmpty() && Bank.isNotEmpty() && CVC.isNotEmpty() && Number.isNotEmpty() && Course != "Select Course" && Time != "Select"){

                val intent = Intent(this,homepage ::class.java)
                startActivity(intent)
                Toast.makeText(this@courses, "Thank you for enrolling you will be notified on status on a later date", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this@courses, "Please enter all fields correctly", Toast.LENGTH_SHORT).show()
            }

        }

        btnCancel.setOnClickListener {
            val intent = Intent(this,homepage ::class.java)
            startActivity(intent)
            Toast.makeText(this@courses, "Hope to hear from you in the future", Toast.LENGTH_SHORT).show()

        }
    }
}