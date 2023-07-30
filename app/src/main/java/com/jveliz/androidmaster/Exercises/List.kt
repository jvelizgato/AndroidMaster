package com.jveliz.androidmaster.Exercises

fun main(){
    val readOnly : List<String> = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())
     val example = readOnly.filter { it.contains("e") }
    // it es cada uno de los valores
    println("filtar todos los que contengan e")
    println(example)
    //todos los valores en su posicion
    readOnly.forEach { println(it) }
    //////
    readOnly.forEach { weekD -> println(weekD) }

    mutableList()

}

fun mutableList(){

    var weekDays:MutableList<String> = mutableListOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    weekDays.add(1,"Mi Día")
    println(weekDays)




}