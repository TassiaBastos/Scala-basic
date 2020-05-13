package aulasbasicas.cfuncoes

object Funcoes extends App{

  // nome/parametros/retorno/implementacao
  def umaFuncao(a: String, b: Int): String =
    a + " " + b

  //posso usar blocos
  def umaFuncaoComBloco(a: String, b: Int): String = {
    a + " " + b
  }
  // a chamada de uma funcao tambem é uma expressao
  println(umaFuncao("hello", 3))

  def umaFuncaoSemParametro(): Int = 42
  println(umaFuncaoSemParametro())
  println(umaFuncaoSemParametro) //compilador coloca um warning informando que nao tem parametros

  // em linguagem funcional se voce precisa de um loop, use recursao.
  def umaFuncaoQueRepete(umaString: String, n: Int): String={
    if(n==1) umaString
    else umaString + umaFuncaoQueRepete(umaString, n-1)
  }

  println(umaFuncaoQueRepete("hello", 3))

  // se eu apagar o tipo de retorno de uma funcao,
  // mesmo assim o compilador identifica qual o tipo de retorno.
  // isso nao acontece em uma funcao recursiva.
  def umaFuncao2(a: String, b: Int) = {
    a + " " + b
  }
  //a funcao nao retorna, imprime no console ou altera o valor de uma variavel externa
  def umaFuncaoComEfeitosColaterais(umaString: String): Unit= println(umaString)

  def umaFuncaoGrande(n: Int): Int = {
    def umaFuncaoPequena(a: Int, b: Int): Int = a + b

    umaFuncaoPequena(n, n-1) // expressao de retorno da implementacao da funcao maior
  }
  println("UMA FUNCAO GRANDE")
  println(umaFuncaoGrande(4))

  //EXERCICIOS

  /*
  1. Criar uma funcao que pega dois parametros (nome, idade) => "Oi meu nome é $nome e tenho $idade anos."
  2. Funcao Fatorial 1*2*3*4 *n
  3. Funcao Fibonacci
  f(1) =1
  f(2) = 1
  f(n) = f(n-1)+f(n-2)
  4. Funcao que testa se um numero é primo
   */

  //1

  def questao1 (nome: String, idade: Int):String =
    "Oi meu nome é " + nome + " e tenho " + idade + " anos de idade"
  println(questao1("Maria", 15))

  //2

  def fatorial (n: Int): Int =
    if(n <=0) 1
    else n * fatorial(n-1)

  println(fatorial(5))

  //3
  def fibonacci(n: Int): Int =
    if(n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13 21

  println(fibonacci(8))

  //4
  def ehprimo(n: Int): Boolean ={
    def ehPrimoAte(t: Int): Boolean =
      if (t <= 1) true
      else n % t  != 0  && ehPrimoAte(t-1)

    ehPrimoAte(n/2)
  }

  println(ehprimo(37))
  println(ehprimo(2003))
  println(ehprimo(37*17))


}
