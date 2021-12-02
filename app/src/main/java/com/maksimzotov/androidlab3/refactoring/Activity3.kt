package com.maksimzotov.androidlab3.refactoring

import android.os.Bundle
import com.maksimzotov.androidlab3.databinding.Activity3Binding

class Activity3 : BaseActivity<Activity3Binding>(Activity3Binding::inflate) {
    companion object {
        const val REQUEST_CODE = 1
        const val BACK_TO_FIRST_CODE = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.title = "Activity 3"

        viewBinding.bnToSecond.setOnClickListener {
            finish()
        }
        viewBinding.bnToFirst.setOnClickListener {
            setResult(BACK_TO_FIRST_CODE)
            finish()
        }
    }
}