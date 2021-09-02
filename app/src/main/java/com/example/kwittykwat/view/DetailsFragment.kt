package com.example.kwittykwat.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kwittykwat.R
import com.example.kwittykwat.databinding.FragmentDetailBinding

class DetailsFragment : Fragment(R.layout.fragment_detail) {

    private lateinit var binding: FragmentDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)
    }

}