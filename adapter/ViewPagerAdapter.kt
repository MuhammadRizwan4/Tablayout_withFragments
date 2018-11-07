package com.example.muhammadrizwan.tablayout.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.muhammadrizwan.tablayout.fragments.Fragment_One
import com.example.muhammadrizwan.tablayout.fragments.Fragment_Three
import com.example.muhammadrizwan.tablayout.fragments.Fragmetn_Two

class ViewPagerAdapter(var ctx : Context , fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position)
        {
            0-> {
                  return  Fragment_One()
            }
            1 ->{
                return Fragmetn_Two()
            }
            else -> {
                return Fragment_Three()

            }

        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        when (position)
        {
            0->
            {
                return "Tab One"
            }
            1->
            {
                return "Tab Two"
            }
            else ->
            {
                return "Tab Three"
            }
        }

    }
}