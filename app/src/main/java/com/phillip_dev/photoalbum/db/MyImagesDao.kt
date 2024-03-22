package com.phillip_dev.photoalbum.db

import androidx.room.Dao
import androidx.room.Insert
import com.phillip_dev.photoalbum.Model.MyImages

@Dao
interface MyImagesDao {

    @Insert
    suspend fun addImage(myImages: MyImages)
}