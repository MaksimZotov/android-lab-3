package com.maksimzotov.androidlab3.task2

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
            startActivityForResult(Intent(this, Activity3::class.java), Activity3.REQUEST_CODE)
        }

        viewBinding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about) {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
            return@setOnItemSelectedListener true
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity3.BACK_TO_FIRST_CODE) {
            finish()
        }
    }
}