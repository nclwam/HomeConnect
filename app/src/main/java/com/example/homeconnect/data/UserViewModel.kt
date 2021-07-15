package com.example.homeconnect.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel (application: Application): AndroidViewModel(application) {
    val readAllData: LiveData<List<User>>

    private val repository: UserRepository

    init {
        val userDao = UserDatabase.getDatabase(application).UserDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData

    }

    fun addUser(user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            //this coroutine will run the function in a background thread
            repository.addUser(user)
        }
    }

}


