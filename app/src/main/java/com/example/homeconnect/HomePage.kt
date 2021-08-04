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


//        instantiate the preference class
        val SharedPreference: SharedPreference = SharedPreference()

//        declared shared prefernce
        val preference = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext())

        val name =preference.getString(SharedPreference.FirstName,"")
        val lname =preference.getString(SharedPreference.LastName,"")
        val email =preference.getString(SharedPreference.email,"")

        Toast.makeText(this,"WELCOME " +name, Toast.LENGTH_SHORT).show()

//        showing in a textview
        info.setText("WELCOME " +name)

    }

    fun gethousehelp(view: View) {
        startActivity(Intent(this,DisplayHousehelp::class.java))

    }
    fun registerhh(view: View) {
        startActivity(Intent(this,RegisterWorkersActivity::class.java))

    }
}