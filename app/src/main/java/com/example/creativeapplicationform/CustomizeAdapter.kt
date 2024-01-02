package com.example.creativeapplicationform

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CustomizeAdapter(val resultist: List<ModelClass.Data>,val context: InformationDetailsActivity)
    : RecyclerView.Adapter<CustomizeViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomizeViewHolder {
        val  view: View= LayoutInflater.from(context).inflate(R.layout.itemuser,parent,false)
        return CustomizeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomizeViewHolder, position: Int) {
        holder.itemText.text = resultist.get(position).email
    }

    override fun getItemCount(): Int {
        return resultist.size
    }

}

class CustomizeViewHolder(itemView: View) : ViewHolder(itemView)
{
    val itemText: TextView = itemView.findViewById(R.id.textView)
}