package com.limjihoon.githubtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.limjihoon.githubtest.R
import com.limjihoon.githubtest.databinding.ActivitySecondBinding
import java.util.ResourceBundle

class SecondActivity : AppCompatActivity() {

    lateinit var binddin :ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binddin= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binddin.root)
    }
}