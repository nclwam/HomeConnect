package com.example.homeconnect.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.homeconnect.Electrician.Electrician
import com.example.homeconnect.Electrician.ElectricianDao
import com.example.homeconnect.Househelp.Househelp
import com.example.homeconnect.Househelp.HousehelpDao
import com.example.homeconnect.Plumbers.Plumber
import com.example.homeconnect.Plumbers.PlumberDao

@Database(entities = [User::class], version = 3, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {
    abstract fun UserDao():UserDao


    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance

                return instance
            }
        }
    }

}