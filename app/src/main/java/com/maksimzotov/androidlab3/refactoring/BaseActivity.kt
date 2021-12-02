package com.maksimzotov.androidlab3.refactoring

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.maksimzotov.androidlab3.R

abstract class BaseActivity<VB: ViewBinding>(
    private val inflate: (LayoutInflater) -> VB
) : AppCompatActivity() {
    private var _viewBinding: VB? = null
    protected val viewBinding get() = checkNotNull(_viewBinding) { "viewBinding must not be null"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _viewBinding = inflate(layoutInflater)
        setContentView(viewBinding.root)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNav?.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity) {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
            return@setOnItemSelectedListener true
        }
    }
}