package com.example.homeconnect.Electrician

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.homeconnect.data.UserDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ElectricianViewModel (application: Application): AndroidViewModel(application) {

//    private val readAllData: LiveData<List<Electrician>>
//    private val repository: ElectricianRepository

    init {
//        val userDao = UserDatabase.getDatabase(application)
//        repository = ElectricianRepository(userDao)
//        readAllData = repository.readAllData

    }

    fun addElectrician(user: Electrician) {
//        viewModelScope.launch(Dispatchers.IO) {
//            //this coroutine will run the function in a background thread
//            repository.addElectrician(user)
        }
    }




