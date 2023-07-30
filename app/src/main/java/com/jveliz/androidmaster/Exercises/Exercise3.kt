package com.jveliz.androidmaster.Exercises
/**En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código,
escribe un programa que convierta una temperatura de una escala a otra con estas fórmulas:

De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
Ten en cuenta que el método String.format("%.2f", /* measurement */ )
se usa para convertir un número en un tipo String con 2 decimales.
**/

fun main() {
    // Fill in the code.
    //printFinalTemperature(27.0,"Celsius","Fahrenheit")
}



fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")

  /* fun conversionFormula(initialMeasurement:Double):Double {
       if ((initialUnit.uppercase() == "CELSIUS") and (finalUnit.uppercase() == "FAHRENHEIT")){
         return   (9/(5*initialMeasurement)) + 32
       }else if ((initialUnit.uppercase() == "KELVIN") and (finalUnit.uppercase() == "CELSIUS")){
           return initialMeasurement - 273.5
       }else if ((initialUnit.uppercase() == "FAHRENHEIT") and (finalUnit.uppercase() == "KELVIN")){
           return (5/(9*(initialMeasurement-32)) + 273.15)
       }
    }*/


        /**
         * De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
           Kelvin a Celsius: °C = K - 273.15
           De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
         */


}
/**Completa la función main() para que llame a la función printFinalTemperature()
 * e imprima las siguientes líneas. Debes pasar argumentos para la fórmula de conversión y temperatura.
 * Sugerencia: Te recomendamos usar valores Double para evitar el truncamiento de Integer durante
 * las operaciones de división.


27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.

// Definición de la función de conversión de dólares a euros
fun convertirDolaresAEuros(dolares: Double): Double {
val tipoCambio = 0.85 // Supongamos que 1 dólar equivale a 0.85 euros
return dolares * tipoCambio
}

fun main() {
// Declaración de la variable conversionFormula
val conversionFormula: (Double) -> Double = ::convertirDolaresAEuros

// Ejemplo de uso
val cantidadDolares = 100.0
val cantidadEuros = conversionFormula(cantidadDolares)
println("$cantidadDolares dólares son $cantidadEuros euros")
}


 **/
