package com.example.homeconnect.Plumbers

import androidx.lifecycle.LiveData


class PlumberRepository (private val PlumberDao: PlumberDao) {

    val readAllData: LiveData<List<Plumber>> = PlumberDao.readAllData()

    suspend fun addPlumber(user: Plumber) {
        PlumberDao.addPlumber(user)
    }
}
