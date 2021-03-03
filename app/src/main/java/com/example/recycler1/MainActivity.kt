package com.example.recycler1

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val orderList = ArrayList<model>()
    private lateinit var myAdapter: myAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView1)
        myAdapter = myAdapter(orderList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = myAdapter
        prepareOrderData()

    }
    private fun prepareOrderData() {
        var order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        order=model("Ice Cream Sundae","145,Mall of India",R.drawable.fimage1,"Rs.100","03 March 11:00 P.M")
        orderList.add(order)
        myAdapter.notifyDataSetChanged()
    }
}