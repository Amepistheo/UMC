package com.example.ssumc_week6

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainVPAdapter(fragment: Fragment):FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ChildOneFragment()
            1 -> ChildTwoFragment()
            2 -> ChildThreeFragment()
            else -> ChildOneFragment()
        }
    }

}