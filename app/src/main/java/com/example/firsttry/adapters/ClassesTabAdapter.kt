package com.example.firsttry.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.firsttry.frags.BlueFragment
import com.example.firsttry.frags.PinkFragment

class ClassesTabAdapter(fragmentManager: FragmentManager , lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager , lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> BlueFragment()
            1 -> PinkFragment()
            else -> BlueFragment()
        }
    }

}