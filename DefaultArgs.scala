package aulasbasicas.gdefaultandnamedarguments

object DefaultArgs extends App{

  // sabemos que o acumulador do fatorial sera 1 ainda em tempo de definicao da funcao,
  //  para nao ter que informar este valor no momento da chamada da funcao,
  // podemos usar o valor default para tal parametro ou criar uma funcao externa que recebe
  // apenas um valor.
  def trFatorial(n: Int, acumulador: Int  = 1): Int =
    if (n <=1 ) acumulador
    else trFatorial(n -1, n * acumulador)


  val fatorial10 = trFatorial(10,1)
  val fatorial11 = trFatorial(10)
  val fatorial12 = trFatorial(10, 3) // vai sobrescrever o default

  def salvarFigura(format:String, comprimento: Int, altura: Int) = println("figura salva")
  salvarFigura("jpg", 800, 600)

//  def salvarFigurav2(format:String = "jpg", comprimento: Int, altura: Int) = println("figura salva")
//  salvarFigurav2(800, 600) // compilador acha que 800 é o primeiro parametro

  def salvarFigurav3(format:String = "jpg", comprimento: Int = 1920, altura: Int = 1080) = println("figura salva")
  salvarFigurav3()
//  salvarFigurav3(800) // o compilador nao sabe

  salvarFigurav3(comprimento = 800)
  salvarFigurav3(altura = 600, comprimento = 800, format = "bmp")

  /*
  SOLUCAO
  1. passar todos os argumentos
  2. nomear os argumentos
   */



}
