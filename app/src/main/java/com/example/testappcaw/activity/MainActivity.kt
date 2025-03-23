package com.example.testappcaw.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testappcaw.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
}