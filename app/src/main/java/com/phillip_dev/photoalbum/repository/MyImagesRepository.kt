package com.phillip_dev.photoalbum.repository

import androidx.lifecycle.LiveData
import com.phillip_dev.photoalbum.db.MyImagesDao
import com.phillip_dev.photoalbum.model.MyImages

class MyImagesRepository {

    var myImagesDao : MyImagesDao
    var imageList : LiveData<List<MyImages>>
}