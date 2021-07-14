package com.example.homeconnect.Plumbers

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface PlumberDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun  addPlumber(user: Plumber)

    @Query("SELECT * FROM Plumbers_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Plumber>>
}