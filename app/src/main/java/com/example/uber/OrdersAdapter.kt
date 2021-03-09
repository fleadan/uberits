package com.example.uber

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class OrdersAdapter(private val orders: List<order>) : RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder>() {

    inner class OrdersViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var subtotal = renglon.findViewById<TextView>(R.id.subtotalRenglon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        val renglon_layout = inflater.inflate(R.layout.renglonlayout,parent, false)
        return OrdersViewHolder(renglon_layout)
    }


    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {


        val dato = orders[position]
        val subtotal = dato.total


        holder.subtotal.text = "Subtotal: " + dato.total.toString()

    }

    override fun getItemCount(): Int {
        return orders.size

    }

}