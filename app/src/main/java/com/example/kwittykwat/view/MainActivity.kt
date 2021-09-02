package com.example.kwittykwat.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kwittykwat.R
import com.example.kwittykwat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
