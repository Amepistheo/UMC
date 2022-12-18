package com.example.ssumc_1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var trueBtn: Button? = null
    var targetTextView: TextView? = null
    var falseBtn: Button? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueBtn = findViewById(R.id.btn_visible_true)
        targetTextView = findViewById(R.id.text_visible_target)
        falseBtn = findViewById(R.id.btn_visible_false)
        trueBtn.setOnClickListener(this)
        falseBtn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view === trueBtn) {
            targetTextView!!.visibility = View.VISIBLE
        } else if (view === falseBtn) {
            targetTextView!!.visibility = View.INVISIBLE
        }
    }
}

