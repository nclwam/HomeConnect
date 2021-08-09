package com.example.homeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.preference.PreferenceManager
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.homeconnect.Househelp.HouseHelpViewModel
import com.example.homeconnect.Househelp.Househelp
import com.example.homeconnect.Househelp.HousehelpDao
import com.example.homeconnect.data.User
import com.example.homeconnect.data.UserDao
import com.example.homeconnect.data.UserDatabase
import com.example.homeconnect.data.UserViewModel
import kotlinx.android.synthetic.main.activity_create_acc.*
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register_workers.*

class RegisterWorkersActivity : AppCompatActivity() {

    private lateinit var mUserViewModel: HouseHelpViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_workers)


        //        instantiate the preference class
        val SharedPreference: SharedPreference = SharedPreference()

//        declared shared prefernce
        val preference = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext())

        val name = preference.getString(SharedPreference.FirstName, "")

//        showing in a textview
        welcomeadmin.setText("WELCOME " + name)




            adminnext.setOnClickListener() {
                InsertData()
            }
            mUserViewModel= ViewModelProvider(this).get(HouseHelpViewModel::class.java)

        }
        private fun InsertData() {
            val FirstName = hhfname.text.toString()
            val LastName = hhlname.text.toString()
            val identityno = hhidno.text.toString()
            val Phonenumber = hhphoneno.text.toString()
            val yob = hhyob.text.toString()


            val Househelp = Househelp(0, FirstName, LastName, identityno, Phonenumber)

            mUserViewModel.addHousehelp(Househelp)
            Toast.makeText(this, "Registration Successful" + FirstName, Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MapsActivity::class.java))


        }


        }

