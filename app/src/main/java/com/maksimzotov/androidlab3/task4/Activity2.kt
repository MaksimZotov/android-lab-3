package com.maksimzotov.androidlab3.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maksimzotov.androidlab3.R
import com.maksimzotov.androidlab3.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private val viewBinding by lazy { Activity2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportActionBar?.title = "Activity 2"

        viewBinding.from2To1.setOnClickListener {
            finish()
        }
        viewBinding.from2To3.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }

        viewBinding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about) {
                startActivity(Intent(this, ActivityAbout::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            }
            return@setOnItemSelectedListener true
        }
    }
}