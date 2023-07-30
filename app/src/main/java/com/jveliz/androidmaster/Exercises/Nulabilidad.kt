package com.jveliz.androidmaster

fun main(){
    var name : String? = null //Asi se declara una variable nque puede aceptar un valor null

    //println(name!!.get(3)) // los signos de admiracion declaran que no es nulo con seguridad
    //Aqui nos aseguramos por si el valor de la variable es Null, de enviar un mensaje
    println(name?.get(3) ?: "Valor Null")
}