 package com.example.homeconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.preference.PreferenceManager
import android.view.View
import android.widget.Toast
import com.example.homeconnect.data.User
import com.example.homeconnect.data.UserDao
import com.example.homeconnect.data.UserDatabase
import kotlinx.android.synthetic.main.activity_create_acc.*
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var user_type: Int =1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        instantiate the preference class
        val SharedPreference: SharedPreference = SharedPreference()

//        declared shared prefernce
        val preference = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext())

        val name = preference.getString(SharedPreference.FirstName, "")
        Toast.makeText(this, "WELCOME " + name, Toast.LENGTH_SHORT).show()

//        showing in a textview
        loginperson.setText("WELCOME " + name)


        startActivity(Intent(this, HomePage::class.java))





        loginbuttonid.setOnClickListener {
            //when the login button is clicked I will perform the following tasks
            // 1 fatma ali 23
            val Email = emailid.text.toString()
            val Password = passid.text.toString()
            Toast.makeText(this, "you clicked me", Toast.LENGTH_SHORT).show()

            val thread: Thread
            //instantiate the database
            val database_user: UserDatabase = UserDatabase.getDatabase(this)

            //go to the database and accessing the dao
            val userdao: UserDao = database_user.UserDao()

            Thread {
                //prepare your query to execute in the background
                Looper.prepare()
                val user: User = userdao.loginuser(Email, Password)

               user_type = user.user_type


            }.start()




            if(user_type.equals(4)){
                Toast.makeText(this, "this is an admin", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, RegisterWorkersActivity::class.java))
            }else{
                Toast.makeText(this, "this is a normal user", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, HomePage::class.java))
            }
        }
    }
}

//                if (user.user_type.equals(1)){
//                    startActivity(Intent(this, RegisterWorkersActivity::class.java))
//                }else{
//                    startActivity(Intent(this, HomePage::class.java))
//
//                }
//
//                execute looper
//                Looper.loop();
//            }.start()
//        }
//

//    }

//    fun homepage(view: View) {
//        startActivity(Intent(this@LoginActivity,HomePage::class.java))
//    }
//}

//        login_btn.setOnClickListener {
//
//            val firstName_login = first_name_login.text.toString()
//            val lastName_login =login_age.text.toString()
//            val userDatabase: UserDatabase = UserDatabase.getDatabase(this)
//            val userdao: UserDao = userDatabase.userDao()
//
//            val thread: Thread
//            Thread{
//                Looper.prepare();
//                val user: User = userdao.login(firstName_login,lastName_login)
//                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
//                Looper.loop();
//            }.start()

