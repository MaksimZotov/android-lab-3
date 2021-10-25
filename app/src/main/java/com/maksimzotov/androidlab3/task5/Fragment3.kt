package com.maksimzotov.androidlab3.task5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.maksimzotov.androidlab3.R
import com.maksimzotov.androidlab3.databinding.Fragment3Binding

class Fragment3 : Fragment() {
    private val viewBinding by lazy { Fragment3Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().setSupportActionBarTitle("Fragment 3")

        viewBinding.from3To1.setOnClickListener {
            findNavController().popBackStack(R.id.fragment1, false)
        }
        viewBinding.from3To2.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}