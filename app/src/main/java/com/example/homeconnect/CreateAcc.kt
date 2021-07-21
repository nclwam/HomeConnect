package com.example.homeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.homeconnect.data.User
import com.example.homeconnect.data.UserViewModel
import kotlinx.android.synthetic.main.activity_create_acc.*

class CreateAcc : AppCompatActivity() {
    private lateinit var mUserViewModel: UserViewModel
    val user_type : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_acc)

        mUserViewModel= ViewModelProvider(this).get(UserViewModel::class.java)
        val questiononeid=findViewById<RadioGroup>(R.id.workerviewgroup)

        questiononeid.setOnCheckedChangeListener( { group, checkedId ->
            val quiz : RadioButton =findViewById(checkedId)
           val user_type : Int = quiz.id;
        }
        )

//        Button1.setOnClickListener() {
//           Insertdata()
//}

    }
    private fun Insertdata() {
        val FirstName = P1.text.toString()
        val user_type = user_type
        val LastName = P2.text.toString()
        val Email = P3.text.toString()
        val PhoneNumber = P4.text.toString()
        val Password = P5.text.toString()
        val user=User(0,user_type,FirstName,LastName,Email,PhoneNumber,Password)

        mUserViewModel.addUser(user)
        Toast.makeText(this,"Registration Successfull", Toast.LENGTH_SHORT).show()

        startActivity(Intent(this,LoginActivity::class.java))

    }

    fun CreateAccount(view: View) {
        Insertdata()
    }


}
