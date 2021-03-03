package com.example.recycler1

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import androidx.recyclerview.widget.RecyclerView

internal class myAdapter(private var orderList:List<model>):RecyclerView.Adapter<myAdapter.MyViewHolder>(){
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var Ice:TextView=view.findViewById(R.id.textview1)
        var Mall:TextView=view.findViewById(R.id.textView2)
        var Date:TextView=view.findViewById(R.id.textView3)
        var Rupee:TextView=view.findViewById(R.id.textView4)
        var Image:ImageView=view.findViewById(R.id.image1)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return orderList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val order = orderList[position]
        holder.Ice.text = order.Ice
        holder.Mall.text = order.Mall
        holder.Date.text=order.Date
        holder.Rupee.text=order.Rupee
        holder.Image.setImageResource(R.drawable.fimage1)


    }

}