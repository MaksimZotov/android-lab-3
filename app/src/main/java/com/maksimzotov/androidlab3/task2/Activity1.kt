package com.maksimzotov.androidlab3.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maksimzotov.androidlab3.R
import com.maksimzotov.androidlab3.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    private val viewBinding by lazy { Activity1Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportActionBar?.title = "Activity 1"

        viewBinding.bnToSecond.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }

        viewBinding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity) {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
            return@setOnItemSelectedListener true
        }
    }
}