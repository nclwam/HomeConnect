package com.example.homeconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_home_page.*

class RegisterWorkersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_workers)


        //        instantiate the preference class
        val SharedPreference: SharedPreference = SharedPreference()

//        declared shared prefernce
        val preference = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext())

        val name =preference.getString(SharedPreference.FirstName,"")
        
//        showing in a textview
        info.setText("WELCOME " +name)
    }
}