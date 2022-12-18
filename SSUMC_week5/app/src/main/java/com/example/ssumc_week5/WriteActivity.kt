package com.example.ssumc_week5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ssumc_week5.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {
    private lateinit var viewbinding : ActivityWriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding = ActivityWriteBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)

        var etTitle = viewbinding.etTitle
        var etContents = viewbinding.etContents

        viewbinding.btnSave.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java).apply {
                putExtra("title",viewbinding.etTitle.text.toString())
                putExtra("contents",viewbinding.etContents.text.toString())
            }
            setResult(RESULT_OK,intent)
            if (!isFinishing) finish()
        }
    }
}