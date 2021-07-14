package com.example.homeconnect.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun  addUser(user:User)

    @Query("SELECT * FROM users_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

//    @Query("SELECT * FROM users_table LIMIT 1")
//    fun readUser(): LiveData<User>
//
//    @Query("SELECT *FROM users_table LIMIT 1")
//    fun getdata ():LiveData<User>

}