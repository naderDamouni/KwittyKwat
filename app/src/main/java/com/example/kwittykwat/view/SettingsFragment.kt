package com.example.kwittykwat.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kwittykwat.R
import com.example.kwittykwat.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private lateinit var binding: FragmentSettingsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        return binding.settingsTextview.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigateToBrowseFragment)
        }
    }

}