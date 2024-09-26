package com.example.peof

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.peof.databinding.ActivityFactBinding

class Fact : AppCompatActivity() {
    private lateinit var binding:ActivityFactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFs.setOnClickListener {
            val input = binding.etF.text.toString()
            if(input.isNotEmpty()){
                val num=input.toInt()
                var fact:Long=1
                for(i in 1..num) {
                    fact = fact * i
                }

                binding.reF.text = "Factorial of  $num is $fact"
            }else{
                binding.reF.text="Please enter a number "
            }
        }

    }
}