package com.example.homeconnect.Electrician

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface ElectricianDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun  addElectrician(user:Electrician)

    @Query("SELECT * FROM electrician_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Electrician>>


}