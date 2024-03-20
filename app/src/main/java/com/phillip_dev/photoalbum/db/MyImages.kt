package com.phillip_dev.photoalbum.db

import androidx.room.Entity

@Entity(tableName = "my_images")
class MyImages(
    val imageTitle: String,
    val imageDescription: String,
    val imageAsString: String
) {

}