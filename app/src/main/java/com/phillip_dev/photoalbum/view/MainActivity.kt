package com.phillip_dev.photoalbum.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.phillip_dev.photoalbum.R
import com.phillip_dev.photoalbum.viewmodel.MyImagesViewModel

class MainActivity : AppCompatActivity() {

    lateinit var myImagesViewModel: MyImagesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImagesViewModel = ViewModelProvider(this)[MyImagesViewModel::class.java]
    }
}