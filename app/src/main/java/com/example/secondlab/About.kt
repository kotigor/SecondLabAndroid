package com.example.secondlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.secondlab.databinding.ActivityAboutBinding
import com.example.secondlab.databinding.ActivitySettingsBinding


class About : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    override fun onStart() {
        super.onStart()
        Log.d("About:konst:igor", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("About:konst:igor", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("About:konst:igor", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("About:konst:igor", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("About:konst:igor", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("About:konst:igor", "onRestart")
    }
}