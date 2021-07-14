package com.example.homeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_page)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this@SplashPage, CreateAcc::class.java)
            startActivity(intent)
        },3000 )
    }
    fun NEXT(view: View) {
        val createAccIntent = Intent(this, CreateAcc::class.java).apply {
        }
        startActivity (createAccIntent)
    }
}