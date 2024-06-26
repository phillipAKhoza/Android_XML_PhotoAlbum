package com.phillip_dev.photoalbum.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.phillip_dev.photoalbum.db.MyImagesDao
import com.phillip_dev.photoalbum.db.MyImagesDatabase
import com.phillip_dev.photoalbum.model.MyImages


class MyImagesRepository(application: Application) {

    var myImagesDao : MyImagesDao
    var imageList : LiveData<List<MyImages>>

    init {
        val db = MyImagesDatabase.getDatabaseInstance(application)
        myImagesDao = db.myImagesDao()
        imageList = myImagesDao.getAllImages()
    }

    suspend fun addImage(myImages: MyImages){
        myImagesDao.addImage(myImages)
    }

    suspend fun updateImage(myImages: MyImages){
        myImagesDao.updateImage(myImages)
    }

    suspend fun deleteImage(myImages: MyImages){
        myImagesDao.deleteImage(myImages)
    }

    fun getAllImages() : LiveData<List<MyImages>>{
        return imageList
    }
}