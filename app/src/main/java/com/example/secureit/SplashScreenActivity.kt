package com.example.secureit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.secureit.databinding.ActivitySplashScreenBinding

/**
 * Created by Avinash Vijayvargiya on 25-04-2021.
 */
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySplashScreenBinding = ActivitySplashScreenBinding.inflate(
            layoutInflater
        )
        val view: View = binding.root
        setContentView(view)
        val secondsDelayed = 3
        Handler().postDelayed({
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()
        }, (secondsDelayed * 1000).toLong())
    }
}