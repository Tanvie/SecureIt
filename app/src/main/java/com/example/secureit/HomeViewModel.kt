package com.example.secureit

import androidx.lifecycle.ViewModel
import java.security.MessageDigest

/**
 * Created by Avinash Vijayvargiya on 25-04-2021.
 */
class HomeViewModel : ViewModel() {
    fun getHash(plainText: String, algorithm: String): String {
        val bytes = MessageDigest.getInstance(algorithm).digest(plainText.toByteArray())
        return toHex(bytes)
    }

    private fun toHex(byteArray: ByteArray): String {
        return byteArray.joinToString("") { "%02x".format(it) }
    }
}