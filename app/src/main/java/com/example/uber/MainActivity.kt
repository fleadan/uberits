package com.example.uber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ord = mutableListOf<order>()
    var tip:Double =0.0
    var suma: Double = 0.0
    var sub: Double= 0.0
    var sma: Double = 0.0
    var ser: Double =0.0
    var del : Double=0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init(){
        subtotal.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                if(subtotal.length() != 0){
                    sub = s.toString().toDouble()
                    Log.i("somethin", sub.toString())

                    smol.text = (sub * 0.02).toString()
                    sma = smol.text.toString().toDouble()

                    srv.text = (sub * 0.05).toString()
                    ser = srv.text.toString().toDouble()

                    dlv.text = (sub * 0.1).toString()
                    del = dlv.text.toString().toDouble()

                    tip = String.format("%.2f", subtotal.text.toString().toDouble() * 0.1).toDouble()
                    ten.text = "10% $tip"

                    tip = String.format("%.2f", subtotal.text.toString().toDouble() * 0.15).toDouble()
                    fiftin.text = "15% $tip"

                    tip = String.format("%.2f", subtotal.text.toString().toDouble() * 0.2).toDouble()
                    tueni.text = "20% $tip"

                    tip = String.format("%.2f", subtotal.text.toString().toDouble() * 0.25).toDouble()
                    tuenifai.text = "25% $tip"

                    tip = String.format("%.2f", subtotal.text.toString().toDouble() * 0.3).toDouble()
                    theri.text = "30% $tip"

                    suma = del+ser+sma+tip+sub

                    place.text = "Place Order - Delivery  $suma"
                }

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


            }

        })
    }
    fun benten(view: View) {

        if (subtotal.length() != 0) {

            tip = subtotal.text.toString().toDouble() * 0.1
            tip = String.format("%.2f", tip).toDouble()

            suma = sma +ser + del + tip + sub
            suma = String.format("%.2f", suma).toDouble()
            place.text = "Place Order - Delivery $suma"
            tippi.text = "$tip"

        }
    }
    fun benfiftin(view: View) {

        if (subtotal.length() != 0) {

            tip = subtotal.text.toString().toDouble() * 0.15
            tip = String.format("%.2f", tip).toDouble()

            suma = sma +ser + del + tip + sub
            suma = String.format("%.2f", suma).toDouble()
            place.text = "Place Order - Delivery $suma"
            tippi.text = "$tip"

        }
    }
    fun bentueni(view: View) {

        if (subtotal.length() != 0) {

            tip = subtotal.text.toString().toDouble() * 0.2
            tip = String.format("%.2f", tip).toDouble()

            suma = sma +ser + del + tip + sub
            suma = String.format("%.2f", suma).toDouble()
            place.text = "Place Order - Delivery $suma"
            tippi.text = "$tip"

        }
    }
    fun bentuenifai(view: View) {

        if (subtotal.length() != 0) {

            tip = subtotal.text.toString().toDouble() * 0.25
            tip = String.format("%.2f", tip).toDouble()

            suma = sma +ser + del + tip + sub
            suma = String.format("%.2f", suma).toDouble()
            place.text = "Place Order - Delivery $suma"
            tippi.text = "$tip"

        }
    }
    fun bentheri(view: View) {

        if (subtotal.length() != 0) {

            tip = subtotal.text.toString().toDouble() * 0.3
            tip = String.format("%.2f", tip).toDouble()

            suma = sma +ser + del + tip + sub
            suma = String.format("%.2f", suma).toDouble()
            place.text = "Place Order - Delivery $suma"
            tippi.text = "$tip"

        }
    }


    fun guarda (view: View){

        val orden = order(subtotal.text.toString().toDouble())
        orden.small = sma
        orden.serv = ser
        orden.deli = del
        ord.add(orden)
        Log.i("somethin", ord.toString() )
    }
}