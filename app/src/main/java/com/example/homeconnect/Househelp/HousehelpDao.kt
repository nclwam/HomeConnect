package com.example.homeconnect.Househelp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query



@Dao
interface HousehelpDao {
        @Insert(onConflict = OnConflictStrategy.IGNORE)
        fun  addHousehelp(user: Househelp)

        @Query("SELECT * FROM househelp_table ORDER BY id ASC")
        fun readAllData(): LiveData<List<Househelp>>
    }
