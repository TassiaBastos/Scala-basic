package aulasbasicas.hstrings

object ManipulandoStrings extends App {

  val str: String = "Ola, essa é a linguagem scala"

  println(str.charAt(2))
  //inclusive, exclusive
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Ola"))

  println(str.replace(" ","-"))

  println(str.toLowerCase())
  println(str.toUpperCase())

  println(str.length)

  val umNumeroString = "45"
  val umNumero = umNumeroString.toInt

  println('a' +: umNumeroString :+ 'z') // particular de scala

  println(str.reverse) // particular de scala

  println(str.take(2))

  // Coisas Especificas de Scala : String interpolators

  // S- Interpolators
  val nome = "Paulo"
  val idade = 30
  val msg = s"Ola, meu nome é $nome e eu tenho $idade anos"
  val msg2 = s"Ola, meu nome é $nome e eu tenho ${idade + 1} anos "
  println(msg)
  println(msg2)

  // F- interpolators

  val velocidade = 1.2f
  val msg3 = f"$nome%s pode comer $velocidade%2.2f hamburguers por minuto. "

  println(msg3)


  val x =1.1f
//  val str = f"$x%3d" // erro de compilacao

  // raw - Interpolator

  println(raw"Esse é o \n de nova linha")
  val escaped = "Esse é o \n de nova linha"
  println(raw"$escaped")

}
