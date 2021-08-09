package com.example.homeconnect.Househelp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.homeconnect.data.UserDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HouseHelpViewModel (application: Application): AndroidViewModel(application) {

   private val readAllData: LiveData<List<Househelp>>
   private val repository: HousehelpRepository

    init {
       val userDao = UserDatabase.getDatabase(application).HousehelpDao()
       repository = HousehelpRepository(userDao)
      readAllData = repository.readAllData

    }

    fun addHousehelp(user: Househelp) {
        viewModelScope.launch(Dispatchers.IO) {
            //this coroutine will run the function in a background thread
            repository.addHousehelp(user)
        }
    }
}

