package com.example.uber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_resultado.*

class resultado : AppCompatActivity() {
    private lateinit var ordersAdapter: OrdersAdapter
    private lateinit var orders : ArrayList<order>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val subtotal = intent.getDoubleExtra("subtotal",1.1)


        initRecycler(subtotal)
    }

    fun initRecycler(subtotal: Double) {
        orders = ArrayList<order>()
        ordersAdapter = OrdersAdapter(orders)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ordersAdapter

        for(i in 0..10){
            orders.add(order(subtotal))
        }

    }
}