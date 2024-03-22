package com.phillip_dev.photoalbum.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.phillip_dev.photoalbum.model.MyImages

@Database(entities = [MyImages::class], version = 1)
abstract class MyImagesDatabase : RoomDatabase(){

    abstract fun myImagesDao() : MyImagesDao

    companion object{
        private var instance : MyImagesDatabase? = null

        fun getDatabaseInstance(context :Context) : MyImagesDatabase{
            synchronized(this){
                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MyImagesDatabase::class.java,
                        "my_pictures"
                    ).build()
                }
                return instance as MyImagesDatabase
            }
        }
    }
}