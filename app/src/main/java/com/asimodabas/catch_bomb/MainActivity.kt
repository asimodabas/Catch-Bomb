package com.asimodabas.catch_bomb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.asimodabas.catch_bomb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var score = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.imageView.setOnClickListener {
            increaseScore()
        }
        binding.imageView10.setOnClickListener {
            increaseScore()
        }
        binding.imageView11.setOnClickListener {
            increaseScore()
        }
        binding.imageView12.setOnClickListener {
            increaseScore()
        }
        binding.imageView2.setOnClickListener {
            increaseScore()
        }
        binding.imageView3.setOnClickListener {
            increaseScore()
        }
        binding.imageView4.setOnClickListener {
            increaseScore()
        }
        binding.imageView5.setOnClickListener {
            increaseScore()
        }
        binding.imageView6.setOnClickListener {
            increaseScore()
        }
        binding.imageView7.setOnClickListener {
            increaseScore()
        }
        binding.imageView8.setOnClickListener {
            increaseScore()
        }
        binding.imageView9.setOnClickListener {
            increaseScore()
        }


    }

    private fun increaseScore() {
        score += 1
        binding.scoreText.text="Score : $score"
    }

}