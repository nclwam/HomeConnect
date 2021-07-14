package com.example.homeconnect.Househelp

import androidx.lifecycle.LiveData
import com.example.homeconnect.Househelp.Househelp

    class HousehelpRepository(private val HousehelpDao: HousehelpDao) {

        val readAllData: LiveData<List<Househelp>> = HousehelpDao.readAllData()

        suspend fun addHousehelp(user: Househelp) {
            HousehelpDao.addHousehelp(user)


        }
    }
