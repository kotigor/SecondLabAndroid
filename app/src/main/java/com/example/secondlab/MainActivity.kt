package com.example.secondlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.secondlab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        Log.d("MainActivity:konst:igor", "onCreate")
        binding.buttonAbout.setOnClickListener { view ->
            startActivity(Intent(this, About::class.java))
        }
        binding.buttonSettings.setOnClickListener { view ->
            startActivity(Intent(this, Settings::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity:konst:igor", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity:konst:igor", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity:konst:igor", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity:konst:igor", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity:konst:igor", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity:konst:igor", "onRestart")
    }
}