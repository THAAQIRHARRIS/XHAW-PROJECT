package com.example.xhawproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)

        val imgSplash = findViewById<ImageView>(R.id.imgSplash)

        imgSplash.setImageResource(R.drawable.logoetn)

        imgSplash.alpha = 0f
        imgSplash.animate().setDuration(1500).alpha(1f).withEndAction {
            val  i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overrideActivityTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }

    private fun overrideActivityTransition(fadeIn: Int, fadeOut: Int) {

    }
}