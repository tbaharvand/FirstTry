package com.example.firsttry

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.firsttry.adapters.ClassesTabAdapter
import com.example.firsttry.databinding.ActivityClassesTabBinding
import com.google.android.material.tabs.TabLayout

class ClassesTab : AppCompatActivity() {
    private lateinit var binding: ActivityClassesTabBinding
    private lateinit var adapter: ClassesTabAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityClassesTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ClassesTabAdapter(supportFragmentManager , lifecycle)
        binding.classesViewPager2.adapter = adapter
        binding.classesTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(p0: TabLayout.Tab?) {
                if (p0 != null) {
                    binding.classesViewPager2.currentItem = p0.position
                }
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {}
            override fun onTabReselected(p0: TabLayout.Tab?) {}
        })

        binding.classesViewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.classesTabLayout.selectTab(binding.classesTabLayout.getTabAt(position))
            }
        })
    }
}