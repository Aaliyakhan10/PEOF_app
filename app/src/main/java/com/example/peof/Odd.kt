package com.example.peof

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.peof.databinding.ActivityOddBinding

class Odd : AppCompatActivity() {
    private lateinit var binding:ActivityOddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityOddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOs.setOnClickListener {
            val input = binding.etO.text.toString()
            if(input.isNotEmpty()) {
                val num = input.toInt()
                if (num % 2 != 0) {
                    binding.reO.text = "$num is Odd number"
                }else {
                    binding.reO.text = "$num is not Odd number"
                }
            }else{
                binding.reO.text = "Please Enter a number"
            }

        }

    }
}