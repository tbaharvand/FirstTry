package com.example.firsttry

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerView)

//        recyclerView.layoutManager = GridLayoutManager(this ,2 )
        recyclerView.layoutManager = LinearLayoutManager(this )

        val itemsList = ArrayList<NameModel>()

        itemsList.add(NameModel( R.drawable.flag_square_264,"Italy" ))
        itemsList.add(NameModel( R.drawable.flag_square_252,"United States" ))
        itemsList.add(NameModel( R.drawable.flag_square_253,"Brazil" ))
        itemsList.add(NameModel( R.drawable.flag_square_254,"United Kingdom" ))
        itemsList.add(NameModel( R.drawable.flag_square_255,"France" ))
        itemsList.add(NameModel( R.drawable.flag_square_256,"Spain" ))
        itemsList.add(NameModel( R.drawable.flag_square_257,"Canada" ))
        itemsList.add(NameModel( R.drawable.flag_square_259,"Australia" ))
        itemsList.add(NameModel( R.drawable.flag_square_260,"Portugal" ))
        itemsList.add(NameModel( R.drawable.flag_square_261,"Sweden" ))
        itemsList.add(NameModel( R.drawable.flag_square_262,"Norway" ))
        itemsList.add(NameModel( R.drawable.flag_square_263,"Germany" ))

        val adapter = Adapter(itemsList)
        recyclerView.adapter = adapter

    }
}