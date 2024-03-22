package com.phillip_dev.photoalbum.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.phillip_dev.photoalbum.model.MyImages

@Database(entities = [MyImages::class], version = 1)
abstract class MyImagesDatabase : RoomDatabase(){

    abstract fun myImagesDao() : MyImagesDao

    companion object{
        private var instance : MyImagesDatabase? = null
    }
}