package com.phillip_dev.photoalbum.db

import androidx.room.Database
import androidx.room.Entity
import com.phillip_dev.photoalbum.model.MyImages

@Database(entities = [MyImages::class], version = 1)
class MyImagesDatabase {
}