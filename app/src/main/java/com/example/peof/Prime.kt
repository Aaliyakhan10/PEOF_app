package com.example.peof

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.peof.databinding.ActivityMainBinding
import com.example.peof.databinding.ActivityPrimeBinding

class Prime : AppCompatActivity() {
    private lateinit var binding: ActivityPrimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrimeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnPs.setOnClickListener {
            val input = binding.etP.text.toString()

            if (input.isNotEmpty()) {
               var isPrime=true;
                val num: Int = input.toInt()
                if(num<2){
                    binding.reP.text = "$num is not a prime number"

                }else {
                    for (i in 2..<num) {
                        if (num % i == 0) {
                            isPrime = false
                            binding.reP.text = "$num is not a prime number"
                            break;
                        }
                    }
                    if (isPrime) {
                        binding.reP.text = "$num is a prime number"
                    }
                }
            }else {
                binding.reP.text = "Enter a number"

            }
        }
    }
}
