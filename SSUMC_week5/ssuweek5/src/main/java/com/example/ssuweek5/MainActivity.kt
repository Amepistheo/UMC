package com.example.ssuweek5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


data class ListData(val number: Int, var title: String) {}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView : RecyclerView = RecyclerView()
        var data:MutableList<ListData> = setData()
        var adapter = CustomAdapter()
        adapter.listData = data
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun setData() : MutableList<ListData> {
        var data:MutableList<ListData> = mutableListOf()
        for (num in 1..10) {
            var title = "${num}번째 타이틀"
            var listdata = ListData(num, title)
            data.add(listdata)
        }
        return data
    }
}