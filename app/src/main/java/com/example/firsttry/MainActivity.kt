package com.example.firsttry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    val recycler = findViewById<Button>(R.id.recyclerView_btn)
    val intentRecycler = Intent(this, RecyclerViewActivity::class.java)
    recycler.setOnClickListener { startActivity(intentRecycler) }

    val fragment  = findViewById<Button>(R.id.fragment_btn)
    val intentFragment = Intent(this, FragmentActivity::class.java)
    fragment.setOnClickListener { startActivity(intentFragment) }

    val fragmentTest = findViewById<Button>(R.id.fragment_test)
    val intentFragmentTest = Intent(this , FragmentTestActivity::class.java)
    fragmentTest.setOnClickListener { startActivity(intentFragmentTest) }



    }
}