package com.jveliz.androidmaster

/**
 * Variables
 */
fun main() {

    println("variables enteros")
    println("almacenan -2,147,438,647 a 2,147,438,647")
    println("declara variables usando CamellCase")

    val age: Int = 30

    ////
    val enteroLargo: Long = 30
    ////
    val NumeroFlotante: Float = 30.5f
    ////
    val NumeroDoble: Double = 3241.31323534

    /**
     * Variables alfanumericas
     */

    //Char
    println("Cuando declares Char Usa Apostrofes y en String comillas dobles OK")
    val CharExample: Char = 'A'

    //String

    val StringExample: String = "JvelizDevs Suscribete"

//bolean
    val BoleanExample : Boolean =true

    // funciones aritmeticas

    println("Sumar :")

    val Age : Int =46
    val Age2 : Int = 50

    val Suma :Int = Age + Age2
    val Resta = Age2-Age

    println("La Suma es : $Suma , La Resta es : $Resta")
    //println(Age2 - Age)

    //Ahora Funciones en Android con Kotlin
println(sumar(21,14))
    val myRest = mySubtract1(10,3)
    println("La resta de los numeros es : $myRest")

}

fun sumar(A1: Int, A2: Int): Int {

    val suma =  A1 + A2
    return suma

}
fun mySubtract(n1:Int,n2:Int):Int{
    return n1-n2
}
//transformando codigo sencillo

fun mySubtract1(n1:Int,n2:Int):Int = n1-n2
