package com.maksimzotov.androidlab3.refactoring

import android.content.Intent
import android.os.Bundle
import com.maksimzotov.androidlab3.databinding.Activity2Binding

class Activity2 : BaseActivity<Activity2Binding>(Activity2Binding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.title = "Activity 2"

        viewBinding.bnToFirst.setOnClickListener {
            finish()
        }
        viewBinding.bnToThird.setOnClickListener {
            startActivityForResult(Intent(this, Activity3::class.java), Activity3.REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Activity3.REQUEST_CODE && resultCode == Activity3.BACK_TO_FIRST_CODE) {
            finish()
        }
    }
}