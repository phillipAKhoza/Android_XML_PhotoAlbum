package com.phillip_dev.photoalbum.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.phillip_dev.photoalbum.model.MyImages
import com.phillip_dev.photoalbum.repository.MyImagesRepository

class MyImagesViewModel(application: Application) : AndroidViewModel(application) {

    var repository : MyImagesRepository
    var imagesList : LiveData<List<MyImages>>

    init {
            repository = MyImagesRepository(application)
            imagesList = repository.getAllImages()
    }
}