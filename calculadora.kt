/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    val calculo = String.format("%.2f",calculadora(116.0, 35.10,::sub))
    println(calculo)
}

fun div(num1:Double, num2:Double) = num1.div(num2)

fun sub(num1:Double, num2:Double) = num1.minus(num2)

fun mult(num1:Double, num2:Double) = num1.times(num2)

fun modulo(num1:Double, num2:Double) = num1.rem(num2)

fun soma(num1:Double, num2:Double) = num1.plus(num2)

fun calculadora(num1:Double, num2:Double,operation:(Double,Double)->Double):Double{
    val resultado = operation(num1,num2)
    return resultado
}
