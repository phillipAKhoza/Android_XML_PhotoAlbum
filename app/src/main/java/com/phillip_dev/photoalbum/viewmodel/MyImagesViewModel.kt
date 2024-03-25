package com.phillip_dev.photoalbum.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.phillip_dev.photoalbum.model.MyImages
import com.phillip_dev.photoalbum.repository.MyImagesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyImagesViewModel(application: Application) : AndroidViewModel(application) {

    var repository : MyImagesRepository
    var imagesList : LiveData<List<MyImages>>

    init {
            repository = MyImagesRepository(application)
            imagesList = repository.getAllImages()
    }

    fun addImage(myImages: MyImages)= viewModelScope.launch(Dispatchers.IO){
        repository.addImage(myImages)
    }

    fun updateImage(myImages: MyImages)= viewModelScope.launch(Dispatchers.IO){
        repository.updateImage(myImages)
    }

    fun deleteImage(myImages: MyImages)= viewModelScope.launch(Dispatchers.IO){
        repository.deleteImage(myImages)
    }

    fun getAllImages() : LiveData<List<MyImages>>{
        return imagesList
    }
}