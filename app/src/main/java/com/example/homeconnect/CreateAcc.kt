package com.example.homeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.homeconnect.data.User
import com.example.homeconnect.data.UserViewModel
import kotlinx.android.synthetic.main.activity_create_acc.*

class CreateAcc : AppCompatActivity() {
    private lateinit var mUserViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_acc)

        mUserViewModel= ViewModelProvider(this).get(UserViewModel::class.java)

//        Button1.setOnClickListener() {
//           Insertdata()
//}

    }
    private fun Insertdata() {
        val FirstName = P1.text.toString()
        val LastName = P2.text.toString()
        val Email = P3.text.toString()
        val PhoneNumber = P4.text.toString()
        val Password = P5.text.toString()
        val user=User(0,FirstName,LastName,Email,PhoneNumber,Password)

        mUserViewModel.addUser(user)
        Toast.makeText(this,"Registration Successfull", Toast.LENGTH_SHORT).show()

        startActivity(Intent(this, ListUserActivity::class.java))

    }

    fun CreateAccount(view: View) {
        Insertdata()
    }


}
