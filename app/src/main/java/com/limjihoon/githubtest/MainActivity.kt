package com.limjihoon.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.limjihoon.githubtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}