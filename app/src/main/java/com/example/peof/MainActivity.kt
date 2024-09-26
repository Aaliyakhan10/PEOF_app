package com.example.peof

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.peof.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnE.setOnClickListener {
            val intent = Intent(this,Even::class.java)
            startActivity(intent)
        }
        binding.btnF.setOnClickListener {
            val intent = Intent(this,Fact::class.java)
            startActivity(intent)
        }
        binding.btnO.setOnClickListener {
            val intent = Intent(this,Odd::class.java)
            startActivity(intent)
        }
        binding.btnP.setOnClickListener {
            val intent = Intent(this , Prime::class.java)
            startActivity(intent)
        }

    }

}