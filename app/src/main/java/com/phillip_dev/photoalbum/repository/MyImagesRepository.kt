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
}