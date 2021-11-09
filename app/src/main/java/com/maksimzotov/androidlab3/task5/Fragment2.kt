package com.maksimzotov.androidlab3.task5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.maksimzotov.androidlab3.R
import com.maksimzotov.androidlab3.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    private val viewBinding by lazy { Fragment2Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.bnToFirst.setOnClickListener {
            findNavController().popBackStack()
        }
        viewBinding.bnToThird.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }
    }
}