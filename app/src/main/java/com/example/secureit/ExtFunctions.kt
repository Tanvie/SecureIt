package com.example.secureit

import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Avinash Vijayvargiya on 25-04-2021.
 */
fun AppCompatActivity.hideActionBar() {
    if (supportActionBar != null) {
        supportActionBar!!.hide()
    }
}
