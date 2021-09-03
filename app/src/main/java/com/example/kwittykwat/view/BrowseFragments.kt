package com.example.kwittykwat.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kwittykwat.R
import com.example.kwittykwat.databinding.FragmentBrowseBinding

class BrowseFragments : Fragment(R.layout.fragment_browse) {

    private lateinit var binding: FragmentBrowseBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBrowseBinding.bind(view)

       val settingsView = binding.browseSettings.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToSettingsFragment) }

       val detailsView = binding.browseDetails.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToDetailsFragment) }

       return settingsView;
       return detailsView;
    }

}