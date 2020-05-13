package aulasbasicas.bexpressoes

object Expressoes extends App{

  var x = 1 + 2 //expressoes são avaliadas e tem um tipo quando são avaliadas
  println(x)

  println(2 + 3 * 4) // + - * /

  println(1 == x) // expressao condicional
  // == != > >= < <=

  println(!(1 == x)) // negacao
  // ! && ||

  var umaVariavel = 2

  umaVariavel+=3 // isso tambem funciona com -= *= /=  efeitos colaterais pois altera o valor da própria variável
//  umaVariavel = umaVariavel + 3
  // Instrucoes (voce diz ao computador o que ele deve fazer)
  // vs Expressoes (alguma coisa que tem um valor ou um tipo)

  // expressao IF
  val umaCondicao = true
  val umValorDeCondicao = if(umaCondicao) 5 else 3 // essa expressao retorna um valor
  println(umValorDeCondicao)
  println(if(umaCondicao) 5 else 3)
  println(1 + 3)

  var i =0
  while (i< 10){ //maneira de escrever o while em uma linguagem imperativa
    println(i)
    i +=1
  }

  //scala forca tudo para que seja uma expressao
  //  ctrl + shift + p
  val umValorEstranho = (umaVariavel = 3)  // Unit tipo é equivalente a void
  // nao retorna nada com significado
  println("Valor Estranho")
  println(umValorEstranho)

  // code blocks

  // se olhar o tipo desse bloco de codigo o compilador informa que é uma String,
  // devido ao resultado da ultima expressao dentro dele.

  // tudo declarado dentro do bloco fica visivel dentro do bloco
  val umaCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Oi" else "Adeus"
  }

  // o bloco é uma expressao em escala e o valor do bloco como um
  // t0d0 é o valor da ultima expressao

//  val umOutroValor = z // compilador nao reconhece o z

  //QUESTOES

  //1. qual a diferenca entre  "hello world" vs println("hello world")
  //2. Qual o valor de cada bloco abaixo

  val umValor = {
    2<3
  }
  println(umValor)
  val algumOutroValor ={
    if(umValor) 234 else 432
    44
  }
  println(algumOutroValor)
}
