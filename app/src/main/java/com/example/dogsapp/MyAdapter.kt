package com.example.dogsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogsapp.R.id
import com.google.android.material.imageview.ShapeableImageView
import org.w3c.dom.Text

class MyAdapter(private val dogsList:ArrayList<Dogs>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dogsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=dogsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading

    }
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val titleImage:ShapeableImageView=itemView.findViewById(R.id.title_image)
        val tvHeading:TextView=itemView.findViewById(R.id.tvHeading)

    }


}