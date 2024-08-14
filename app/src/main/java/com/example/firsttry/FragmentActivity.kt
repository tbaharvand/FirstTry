package com.example.firsttry
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.firsttry.FragmentClass.Fragment1
import com.example.firsttry.FragmentClass.Fragment2
import com.example.firsttry.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1.setOnClickListener {
            replaceFragment(Fragment1())
        }

        binding.fragment2.setOnClickListener {
            replaceFragment(Fragment2())
        }


    }

    private fun replaceFragment(fragment: Fragment) {
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragment_container , fragment)
//        fragmentTransaction.commit()

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()


    }
}