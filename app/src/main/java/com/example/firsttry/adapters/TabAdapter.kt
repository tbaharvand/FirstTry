package com.example.firsttry.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.firsttry.HomeFragment
import com.example.firsttry.MessageFragment
import com.example.firsttry.SettingFragment

internal class TabAdapter(val context : Context, private val fragmentManager:FragmentManager, lifecycle: Lifecycle )
    :FragmentStateAdapter(fragmentManager , lifecycle) {

    override fun getItemCount(): Int {
       return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> {
                HomeFragment()
            }
            1 -> {
                MessageFragment()
            }

            else -> SettingFragment()
        }
    }
}