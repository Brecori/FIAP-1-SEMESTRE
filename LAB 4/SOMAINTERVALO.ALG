Algoritmo "SOMAINTERVALO"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2022
Var
// Seção de Declarações das variáveis 
a, b, c : real
caminho : real



Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  escreval("Digite 2 números")
  leia(a, b)
  caminho := b
  se a > b entao
     escreva("Números inválidos")
  senao
       Enquanto b>a faca
       b := b - 1
       Se (b mod 2)= 0 entao
       caminho := caminho + b
       fimse
       fimenquanto
  fimse
  Escreva(Caminho)


  

Fimalgoritmo