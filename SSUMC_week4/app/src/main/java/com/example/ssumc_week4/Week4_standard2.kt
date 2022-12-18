package com.example.ssumc_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ssumc_week4.databinding.ActivityWeek4Standard2Binding

class Week4_standard2 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityWeek4Standard2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityWeek4Standard2Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.txtSecond.text = intent.getStringExtra("data")
    }
}
