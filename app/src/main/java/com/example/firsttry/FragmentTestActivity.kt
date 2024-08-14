package com.example.firsttry

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.firsttry.FragmentClass.BlueFragment
import com.example.firsttry.FragmentClass.PinkFragment
import com.example.firsttry.databinding.ActivityFragmentTestBinding

class FragmentTestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragment_test)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityFragmentTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pinkBtn.setOnClickListener { replaceFragment(PinkFragment()) }
        binding.blueBtn.setOnClickListener { replaceFragment(BlueFragment()) }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragment_container_test, fragment).commit()
    }
}