package com.example.secureit

import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.hideActionBar() {
    if (supportActionBar != null) {
        supportActionBar!!.hide()
    }
}
