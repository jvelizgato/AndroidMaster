package com.jveliz.androidmaster.Exercises

fun main   (){

    //Arrays
    val weekDays = arrayOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    println(weekDays.size)

    for (position in weekDays.indices){
        println("He pasado por aqui : Posicion : $position = ${weekDays.get(position)}")
    }
    //
    for (index in weekDays){
        println("los valores son $index ")
        //aqui index toma los valotres y no los indices del array directamente
        }
    for (index in weekDays){
         println(index)
    }
}