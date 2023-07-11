package com.example.kotlinminuteworkoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinminuteworkoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        binding?.flStart?.setOnClickListener(){
            val intent=Intent(this,ExerciseActiviy::class.java)
            startActivity(intent)

        }

    }

    override fun onDestroy() {
        binding=null
        super.onDestroy()
    }
}