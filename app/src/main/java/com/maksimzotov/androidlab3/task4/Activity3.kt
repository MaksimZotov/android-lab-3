package com.maksimzotov.androidlab3.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maksimzotov.androidlab3.R
import com.maksimzotov.androidlab3.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    private val viewBinding by lazy { Activity3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportActionBar?.title = "Activity 3"

        viewBinding.bnToSecond.setOnClickListener {
            finish()
        }
        viewBinding.bnToFirst.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        viewBinding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity) {
                startActivity(Intent(this, ActivityAbout::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            }
            return@setOnItemSelectedListener true
        }
    }
}