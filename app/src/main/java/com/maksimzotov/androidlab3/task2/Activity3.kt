package com.maksimzotov.androidlab3.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maksimzotov.androidlab3.R
import com.maksimzotov.androidlab3.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    companion object {
        const val REQUEST_CODE = 1
        const val BACK_TO_FIRST_CODE = 2
    }

    private val viewBinding by lazy { Activity3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportActionBar?.title = "Activity 3"

        viewBinding.bnToSecond.setOnClickListener {
            finish()
        }
        viewBinding.bnToFirst.setOnClickListener {
            setResult(BACK_TO_FIRST_CODE)
            finish()
        }

        viewBinding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity) {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
            return@setOnItemSelectedListener true
        }
    }
}