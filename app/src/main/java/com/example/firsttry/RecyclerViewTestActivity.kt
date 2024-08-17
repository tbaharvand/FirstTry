package com.example.firsttry

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttry.adapters.StudentAdapter
import com.example.firsttry.models.StudentModel
import java.util.ArrayList

class RecyclerViewTestActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view_test)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerView_studentInfo)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val studentList = ArrayList<StudentModel>()

        studentList.add(StudentModel("Baharvand 1", R.drawable.student))
        studentList.add(StudentModel("Baharvand 2", R.drawable.student))
        studentList.add(StudentModel("Baharvand 3", R.drawable.student))
        studentList.add(StudentModel("Baharvand 4", R.drawable.student))
        studentList.add(StudentModel("Baharvand 5", R.drawable.student))
        studentList.add(StudentModel("Baharvand 6", R.drawable.student))
        studentList.add(StudentModel("Baharvand 7", R.drawable.student))
        studentList.add(StudentModel("Baharvand 8", R.drawable.student))
        studentList.add(StudentModel("Baharvand 9", R.drawable.student))
        studentList.add(StudentModel("Baharvand 10", R.drawable.student))
        studentList.add(StudentModel("Baharvand 11", R.drawable.student))
        studentList.add(StudentModel("Baharvand 12", R.drawable.student))

        val adapter = StudentAdapter(studentList)
        recyclerView.adapter = adapter

    }
}