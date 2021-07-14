package com.example.homeconnect.Plumbers

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.homeconnect.data.UserDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlumberViewModel (application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<Plumber>>
    private val repository: PlumberRepository

    init {
        val userDao = UserDatabase.getDatabase(application).PlumberDao()
        repository = PlumberRepository(userDao)
        readAllData = repository.readAllData

    }

    fun addPlumber(user: Plumber) {
        viewModelScope.launch(Dispatchers.IO) {
            //this coroutine will run the function in a background thread
            repository.addPlumber(user)
        }
    }
}

