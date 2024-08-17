package com.example.firsttry.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttry.R
import com.example.firsttry.models.StudentModel

class StudentAdapter(private val studentList: ArrayList<StudentModel>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val studentName = itemView.findViewById<TextView>(R.id.student_name_tv)!!
        val studentImage= itemView.findViewById<ImageView>(R.id.student_image_iv)!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.student_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = studentList[position]

        holder.studentName.text = student.studentName
        holder.studentImage.setImageResource(student.studentImage)
    }

    override fun getItemCount(): Int {
       return studentList.size
    }
}