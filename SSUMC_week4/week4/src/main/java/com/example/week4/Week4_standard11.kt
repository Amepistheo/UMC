package com.example.week4

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.week4.databinding.ActivityWeek4Standard11Binding

class Week4_standard11 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityWeek4Standard11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        viewBinding = ActivityWeek4Standard11Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        var edtMain = viewBinding.edtMain

        viewBinding.btnMain.setOnClickListener{
            val intent = Intent(this, Week4_standard12::class.java)
            intent.putExtra("data", viewBinding.edtMain.text.toString())
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        crClass.secdata = viewBinding.edtMain.getText().toString()
        Toast.makeText(applicationContext, "${crClass.secdata}", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_LONG).show()

        if (crClass.secdata != "") {
            AlertDialog.Builder(this).run {
                setTitle("임시저장")
                setIcon(R.drawable.ic_dialog_info)
                setMessage("이전 상태로 돌아가기? 내용 : ${crClass.secdata}")
                setPositiveButton("Yes"){dialog, id -> viewBinding.edtMain.setText("${crClass.secdata}")}
                setNegativeButton("No"){dialog, id -> viewBinding.edtMain.setText(" ")}
                    .show()
            }
        }
    }

    class crClass {
        companion object {
            var secdata = " "
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_LONG).show()
    }
}