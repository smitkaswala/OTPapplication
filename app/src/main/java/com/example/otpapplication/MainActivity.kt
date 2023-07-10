package com.example.otpapplication

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import com.example.otpapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pinView.setAnimationEnable(true)
        
        binding.showOtp.setOnClickListener {

            binding.pinView.setText("")

            binding.pinView.setLineColor(ResourcesCompat.getColor(resources, R.color.line_default, theme))

            binding.pinView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.shake))

        }
    }

}