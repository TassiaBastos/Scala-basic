package aulasbasicas.erecursao

import scala.annotation.tailrec

object Recursao extends App{

  def fatorial (n: Int): Int =
    if (n<=1) 1
    else {
      println("Fatorial de " + n + " antes preciso do fatorial de " + (n-1))
      println("Empilhei " + n + " * " + "Fatorial de " + (n-1))
      val result = n * fatorial(n-1)  //chamadas ficam na pilha
      println("Fatorial de " + n + " foi computado")

      result
    }

  println(fatorial(5))
//  println(fatorial(5000)) //erro java.lang.StackOverflowError a pilha tem memoria limitada

//  def outroFatorial (n: Int): Int ={
//    def fatorialHelp(x: Int, acumulador: Int): Int=

  def outroFatorial (n: Int): BigInt ={
    @tailrec // indicar que a funcao tem tail recursion
    def fatorialHelp(x: Int, acumulador: BigInt): BigInt=
      if (x<=1) acumulador
      else fatorialHelp(x-1,x*acumulador) //TAIL RECURSION no exemplo anterior scala usa um stack frame para cada chamada
    // neste exemplo apenas um stack frame é necessario.

    fatorialHelp(n,1)
  }

  /*
  outroFatorial(10) = fatorialHelp(10,1)
  = fatorialHelp(9,10*1)
  = fatorialHelp(8,9*10*1)
  -fatorialHelp(7, 8 * 9 * 10 * 1)
  =....
  =fatorialHelp(2,3* 4* ... * 10 * 1)
  fatorialHelp(1, 1* 2* 3* 4 * 5.... * 10)
  = 1 * 2* 3* 4* 5* 6... * 10
   */

  println(outroFatorial(5000))

  // Quando precisar de Loops, use TAIL RECURSION

  /*
  1. Concatenar a string n vezes
  2. ehPrimo funcao com tail recursion
  3. fibonacci funcao com tail recursion
   */

  // DICA: Utilize acumuladores se necessario use mais de um
  // o acumulador deve ter o mesmo tipo de retorno que a funcao
  @tailrec
  def concatenar(umaString: String, n: Int, acumulador: String): String =
    if(n <=0) acumulador
    else concatenar(umaString,n-1,umaString + acumulador)

  println(concatenar("Hello", 3, ""))

  def ehPrimo (n: Int): Boolean = {
    @tailrec
    def ehPrimoTailRec(t: Int, continuaPrimo: Boolean): Boolean =
      if (!continuaPrimo) false
      else if (t<=1) true
      else ehPrimoTailRec(t - 1,n % t != 0 && continuaPrimo)

    ehPrimoTailRec(n / 2, true)
  }

  println(ehPrimo(2003))
  println(ehPrimo(629))

  def fibonacci(n: Int): Int ={
    def fiboTailRec(i: Int, last: Int, nextLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextLast, last)

    if (n <= 2) 1
    else fiboTailRec(2,1,1)
  }

  println(fibonacci(8))

}
