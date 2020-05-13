package aulasbasicas.abasico

//faz com que apareca a opcao de run quando clica com o botao  direito do mouse
object ValoresVariaveisTypos extends App{

//  A declaracao de tipos quando usamos o val sao opcionais, o compilador
//  vai descobrir com base no valor a direita.

//  O compilador pode inferir tipos
//  val x1: Int = 42  //val x = 42

//  val x: Int = "SCALA"

  val x: Int = 42
  println(x)

//  val nao pode ser reassigned eles sao IMUTAVEIS
//  x=2

  val umaSring: String = "Hello"; // o ponto e virgula é opcional, mas se eu tiver mais de um
                                //  comando na mesma linha tenho que usar o ponto e virgula.
  val umaOutraString: String = "Oiiiii"
  val umBoolean: Boolean = false
  val umChar: Char = 'a'
  val umInt: Int = 3
//  val umShort: Short = 4666223
  val umShort: Short = 4612
//  val umLong: Long = 1321313131213223123
  val umLong: Long = 1321313131213223123L
  val umFloat: Float = 2.0f
  val umDouble: Double = 3.14

  //variaveis
  var umaVariavel: Int = 4
//  pode ser sobrescrita
  umaVariavel = 5

}
