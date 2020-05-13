package aulasbasicas.fcallbynamecallbyvalue

object CBNvsCBV extends App{

  def calledByValue(x: Long): Unit = {
    println("by value: " + x) // equivalente a println("by value: " + 3071381049015)
    println("by value: " + x) // equivalente a println("by value: " + 3071381049015)
  }

  // a seta indica ao compilador que o parametro sera chamado por nome
  // a avaliacao da expressao so sera avaliada no momento que a expressao for utilizada
  def calledByName(x: => Long): Unit = {
    println("by name: " + x) //equivalente a  println("by name: " + System.nanoTime())
    println("by name: " + x) //equivalente a println("by name: " + System.nanoTime())
  }

  //resultado
  //  by value: 3071381049015
  //  by value: 3071381049015
  //  by name: 3071493097615
  //  by name: 3071493146853

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())










  def infinito(): Int = 1 +  infinito()

  def printPrimeiro(x: Int, y: => Int) = println(x)

//  printPrimeiro(infinito(), 34) // java.lang.StackOverflowError
  printPrimeiro(34, infinito())
}
