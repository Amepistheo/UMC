package com.example.ssumc_week5


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ssumc_week5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewbinding : ActivityMainBinding
    private lateinit var getResultText: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)

        val datalist: ArrayList<Data> = arrayListOf()
        val DataRVAd = DataRVAd(datalist)

        viewbinding.rvData.adapter = DataRVAd
        viewbinding.rvData.layoutManager = LinearLayoutManager(this)

        val getResultText = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                val title = result.data?.getStringExtra("title")
                val contents = result.data?.getStringExtra("contents")
                datalist.apply {
                    add(Data(title.toString(), contents.toString()))
                }
                DataRVAd.notifyDataSetChanged()
            }
        }
        viewbinding.btnWrite.setOnClickListener {
            val intent = Intent(
                this@MainActivity, WriteActivity::class.java
            )
            getResultText.launch(intent)
        }
    }
}