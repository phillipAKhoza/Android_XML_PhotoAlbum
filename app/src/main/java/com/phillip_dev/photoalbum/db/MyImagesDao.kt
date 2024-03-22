package com.phillip_dev.photoalbum.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.phillip_dev.photoalbum.Model.MyImages

@Dao
interface MyImagesDao {

    @Insert
    suspend fun addImage(myImages: MyImages)

    @Update
    suspend fun updateImage(myImages: MyImages)

    @Delete
    suspend fun deleteImage(myImages: MyImages)


    fun getAllImages() : LiveData<List<MyImages>>


}