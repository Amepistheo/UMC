package com.example.ssumc_week6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ssumc_week6.databinding.FragmentChildOneBinding
import com.example.ssumc_week6.databinding.FragmentChildTwoBinding

class ChildTwoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentChildTwoBinding.inflate(layoutInflater).root
    }
}