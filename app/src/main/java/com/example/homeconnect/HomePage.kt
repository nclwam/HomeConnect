package com.example.homeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_login.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)


    }

    fun gethousehelp(view: View) {
        startActivity(Intent(this,MapsActivity::class.java))

    }
    fun registerhh(view: View) {
        startActivity(Intent(this,RegisterWorkersActivity::class.java))

    }
}