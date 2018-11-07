package com.example.muhammadrizwan.tablayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.example.muhammadrizwan.tablayout.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tabLayout = findViewById<TabLayout>(R.id.Tab)
        val viewPager = findViewById<ViewPager>(R.id.View_pager)
        tabLayout.setupWithViewPager(viewPager)
        val adapter = ViewPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = adapter
    }
}
