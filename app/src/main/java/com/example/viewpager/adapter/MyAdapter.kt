package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.MainActivity
import com.example.viewpager.fragments.Fragment_One
import com.example.viewpager.fragments.Fragment_Three
import com.example.viewpager.fragments.Fragment_Two

class MyAdapter (mainActivity: MainActivity) : FragmentStateAdapter(mainActivity) {
    val fragment_size = 3
    override fun getItemCount(): Int {
        return  this.fragment_size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> { return  Fragment_One() }
            1 -> { return  Fragment_Two()}
            2 -> {return  Fragment_Three()}
        }
        return Fragment_One()
    }

}