Algoritmo "MULTIPLICA�AOINTERVALO"
// 
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2022
Var
// Se��o de Declara��es das vari�veis 
a, b, c : real
caminho : real



Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
  escreval("Digite 2 n�meros")
  leia(a, b)
  caminho := b
  se a > b entao
     escreva("N�meros inv�lidos")
  senao
       Enquanto b>a faca
       b := b - 1
       Se (b mod 2)<> 0 entao
       caminho := caminho * b
       fimse
       fimenquanto
  fimse
  Escreva(Caminho)


  

Fimalgoritmo