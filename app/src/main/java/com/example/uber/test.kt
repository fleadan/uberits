package com.example.uber

data class order (val total: Double){

    var small: Double=0.0
    var deli: Double=0.0
    var serv: Double=0.0
}

fun main(){
    var orden = order(10.0)

}