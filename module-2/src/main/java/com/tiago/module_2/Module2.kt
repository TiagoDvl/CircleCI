package com.tiago.module_2

import android.app.Application
import android.util.Log
import android.widget.Toast
import com.tiago.module_1.Module1

class Module2 (private val application: Application) {

    fun encrypt() {
        Log.d("Module 2", "Card Encrypted")
        Module1().trackEvent("Event from Module 2")
        Toast.makeText(application, "Using application from source", Toast.LENGTH_LONG).show()
    }
}