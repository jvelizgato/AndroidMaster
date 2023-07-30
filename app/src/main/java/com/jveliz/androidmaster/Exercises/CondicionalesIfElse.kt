package com.jveliz.androidmaster

import androidx.annotation.ReturnThis

fun main(){
    val xxxx = ifBasico("pepe")
    println("$xxxx")

    getTrimester(8)
}

fun ifBasico(name: String):Boolean {
    val bandera = if (name.uppercase() == "PEPE") true else false
    return bandera
}

fun getTrimester(month : Int): String{
    when(month){
        1,2,3 -> println("Primer Trimestre")
        4,5,6 -> println("Segundo Trimestre")
        7,8,9 -> println("Tercer Trimestre")
        10,11,12 -> println("Cuarto Trimestre")

    }
   return when(month){
        in (1 .. 6) ->  "Primer Semestre"
        in (7 .. 12) ->  "Segundo Semestre"
        else ->  "Numero de Mes no valido"
    }
}