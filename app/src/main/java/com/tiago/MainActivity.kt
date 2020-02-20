package com.tiago

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tiago.module_2.Module2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Module2(application).encrypt()
    }
}
