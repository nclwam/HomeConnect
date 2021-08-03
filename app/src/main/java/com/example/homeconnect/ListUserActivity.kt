package com.example.homeconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homeconnect.data.UserViewModel
import kotlinx.android.synthetic.main.activity_list_user.*

class ListUserActivity : AppCompatActivity() {

    private lateinit var mUserViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_user)


        //place the recycler view here
        val adapter = UserRecyclerAdapter()
        val recyclerView = recycler1
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //users viewmodel
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        mUserViewModel.readAllData.observe( this, Observer {  user ->
            adapter.setData(user)
        })

    }
}