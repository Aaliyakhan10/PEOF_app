package com.example.peof

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.peof.databinding.ActivityEvenBinding

class Even : AppCompatActivity() {
    private lateinit var binding:ActivityEvenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityEvenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEs.setOnClickListener {
            val input = binding.etE.text.toString()
            if(input.isNotEmpty()){
                val num:Int = input.toInt()
                if(num%2==0){
                    binding.reE.text = "$num is a Even Number"
                }else{
                    binding.reE.text = "$num is not a Even number"
                }
            }else{
                binding.reE.setText("Please enter a number")
            }
        }
    }
}