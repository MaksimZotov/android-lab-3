package com.maksimzotov.androidlab3.task5

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.maksimzotov.androidlab3.R
import com.maksimzotov.androidlab3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about) {
                findNavController(viewBinding.navHostFragment.id).navigate(R.id.to_about)
            }
            return@setOnItemSelectedListener true
        }
    }
}

fun Activity.setSupportActionBarTitle(title: CharSequence) {
    if (this is MainActivity) {
        supportActionBar?.title = title
    }
}