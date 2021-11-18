package com.qyylylx.carcontroller.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qyylylx.carcontroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Forward.setOnClickListener {  }
        binding.Backward.setOnClickListener {  }
        binding.Left.setOnClickListener {  }
        binding.Right.setOnClickListener {  }
        binding.Stop.setOnClickListener {  }
    }
}