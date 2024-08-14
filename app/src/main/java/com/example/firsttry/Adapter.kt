package com.example.firsttry

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val itemsList : ArrayList<NameModel>) : RecyclerView.Adapter<Adapter.ViewHolder> (){

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        val iconImage: ImageView = itemView.findViewById(R.id.icon_iv)
        val captionText: TextView = itemView.findViewById(R.id.caption_tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemsList[position]

        holder.iconImage.setImageResource(item.iconImage)
        holder.captionText.text = item.captionText
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}