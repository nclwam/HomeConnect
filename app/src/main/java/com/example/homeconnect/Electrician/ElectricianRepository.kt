package com.example.homeconnect.Electrician

import androidx.lifecycle.LiveData

class ElectricianRepository (private val ElectricianDao: ElectricianDao) {

    val readAllData: LiveData<List<Electrician>> = ElectricianDao.readAllData()

    suspend fun addElectrician(user: Electrician) {
        ElectricianDao.addElectrician(user)
    }
}
