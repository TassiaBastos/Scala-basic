package aulasbasicas.dinferenciadetipos

object InferenciaTipo extends App{

  val mensagem = "Ola" // compilador infere que a variavel é do tipo string

  val mensagem2: String = "Ola" // o tipo foi definido

  val x = 2 // compilador sabe que x é int
  val y = x + "itens" // compilador infere que y é String

  def func1(x: Int) = x + 1 //  def func2(x: Int): Int

//  val x: Int = "Ola" // erro de compilacao

//  def fatorial(n: Int) = // compilador nao é capaz de inferir o tipo na funcao recursiva
//    if (n <= 0) 1
//    else n * fatorial(n-1)

}
