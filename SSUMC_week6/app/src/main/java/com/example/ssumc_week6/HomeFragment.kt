package com.example.ssumc_week6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.ssumc_week6.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {
    private lateinit var viewBinding: FragmentHomeBinding
    private lateinit var tablayout: TabLayout
    private lateinit var viewpager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentHomeBinding.inflate(layoutInflater)
        val mainVPAdapter = MainVPAdapter(this)
        tablayout=viewBinding.tabMain
        viewpager=viewBinding.vpMain

        viewBinding.vpMain.adapter = mainVPAdapter

        val tabTitleArray = arrayOf(
            "One",
            "Two",
            "Three",
        )
        TabLayoutMediator(viewBinding.tabMain, viewBinding.vpMain) {tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()
        Log.d("tab", "pass")
        return viewBinding.root
    }
}