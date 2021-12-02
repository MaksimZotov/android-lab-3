package com.maksimzotov.androidlab3.refactoring

import android.content.Intent
import android.os.Bundle
import com.maksimzotov.androidlab3.databinding.Activity1Binding

class Activity1 : BaseActivity<Activity1Binding>(Activity1Binding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.title = "Activity 1"

        viewBinding.bnToSecond.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}