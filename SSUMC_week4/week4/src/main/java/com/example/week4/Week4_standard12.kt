package com.example.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week4.databinding.ActivityWeek4Standard12Binding

class Week4_standard12 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityWeek4Standard12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityWeek4Standard12Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.txtSecond.text = intent.getStringExtra("data")
    }
}

