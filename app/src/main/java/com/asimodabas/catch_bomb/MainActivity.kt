package com.asimodabas.catch_bomb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.asimodabas.catch_bomb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var score = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // CountDownTimer

        object : CountDownTimer(15000, 1000) {
            override fun onTick(p0: Long) {
                binding.timeText.text = "Time : " + p0 / 1000
            }

            override fun onFinish() {
                binding.timeText.text = "Time : 0"

                //Alert

                val alert = AlertDialog.Builder(this@MainActivity)
                alert.setTitle("Game Over")
                alert.setMessage("Restart the game ?")
                alert.setPositiveButton("Yes"){dialog,which ->

                    //Restart
                    val intent = intent
                    finish()
                    startActivity(intent)
                }

                alert.setNegativeButton("No"){dialog,which ->

                    Toast.makeText(this@MainActivity,"Game Over",Toast.LENGTH_SHORT).show()

                }
                alert.show()

            }
        }.start()

        // Image views

        binding.imageView.setOnClickListener {
            increaseScore()
            binding.imageView.setImageDrawable(getDrawable(R.drawable.resim2))
        }
        binding.imageView10.setOnClickListener {
            increaseScore()
            binding.imageView10.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView11.setOnClickListener {
            increaseScore()
            binding.imageView11.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView12.setOnClickListener {
            increaseScore()
            binding.imageView12.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView2.setOnClickListener {
            increaseScore()
            binding.imageView2.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView3.setOnClickListener {
            increaseScore()
            binding.imageView3.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView4.setOnClickListener {
            increaseScore()
            binding.imageView4.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView5.setOnClickListener {
            increaseScore()
            binding.imageView5.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView6.setOnClickListener {
            increaseScore()
            binding.imageView6.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView7.setOnClickListener {
            increaseScore()
            binding.imageView7.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView8.setOnClickListener {
            increaseScore()
            binding.imageView8.setImageDrawable(getDrawable(R.drawable.resim2))

        }
        binding.imageView9.setOnClickListener {
            increaseScore()
            binding.imageView9.setImageDrawable(getDrawable(R.drawable.resim2))

        }


    }

    private fun increaseScore() {
        score += 1
        binding.scoreText.text = "Score : $score"
    }

}