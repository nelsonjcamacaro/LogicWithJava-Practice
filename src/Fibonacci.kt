/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

fun fibonnacci(list: MutableList<Long>){
   var count = 0L
   for (i in 0 ..49){
      if (count > 0){
         list.add(count)
         count += list[i - 1]
         println("valor ${i+1} : ${list[i]}")
      }else {
         list.add(count)
         count++
         println("valor ${i+1} : ${list[i]}")
      }
   }
}


fun main(args: Array<String>) {
   fibonnacci(mutableListOf())
}