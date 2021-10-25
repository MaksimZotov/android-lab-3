package com.maksimzotov.androidlab3.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maksimzotov.androidlab3.R

class ActivityAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "About"
    }
}