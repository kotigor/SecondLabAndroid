package com.example.secondlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.secondlab.databinding.ActivitySettingsBinding

class Settings : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    override fun onStart() {
        super.onStart()
        Log.d("Settings:konst:igor", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Settings:konst:igor", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Settings:konst:igor", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Settings:konst:igor", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Settings:konst:igor", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Settings:konst:igor", "onRestart")
    }
}