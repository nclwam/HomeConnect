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

    @Query("Select * FROM users_table where Email = (:Email) and Password = (:Password) ")
    //select all the records in the database that has the firstname and password that the user has given
    fun loginuser(Email:String , Password: String):User

   @Query("DELETE FROM users_table WHERE id LIKE :id")
   fun delete(id:Int) :Int
//
//    @Query("SELECT *FROM users_table LIMIT 1")
//    fun getdata ():LiveData<User>

}