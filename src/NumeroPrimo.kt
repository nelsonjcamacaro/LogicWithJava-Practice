import kotlin.random.Random

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 */


fun main(args: Array<String>) {
    primeNumber(777)
}
fun primeNumber(number:Int){

    when(true){
        (number == 2),(number == 3),(number == 5),(number == 7),(number == 11),(number == 13) -> println("$number es primo")
        (number == 1) -> println("$number NO es primo")
        (number % 2 ==0),(number % 3 ==0),(number % 5 ==0),(number % 7 ==0),(number % 9 ==0),(number % 11 ==0),(number % 13 ==0) -> println("$number NO es primo")
        number.toString().endsWith("0") -> println("$number NO es primo")
        number.toString().endsWith("1"),number.toString().endsWith("3"),number.toString().endsWith("7"),number.toString().endsWith("9") -> println("$number es primo")
        else -> println("bug")
    }

    (0..100).forEach { number->
        when(true){
            (number == 2),(number == 3),(number == 5),(number == 7),(number == 11),(number == 13) -> println("$number")
            (number == 1) -> null
            (number % 2 ==0),(number % 3 ==0),(number % 5 ==0),(number % 7 ==0),(number % 9 ==0),(number % 11 ==0),(number % 13 ==0) -> null
            number.toString().endsWith("0") -> null
            number.toString().endsWith("1"),number.toString().endsWith("3"),number.toString().endsWith("7"),number.toString().endsWith("9") -> println("$number")
            else -> println("bug")
        }
    }
}