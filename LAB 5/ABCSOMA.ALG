Algoritmo "ABCSOMA"
// 
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2022
Var
// Se��o de Declara��es das vari�veis 
a, b, c : real
i, soma : real
divi: logico


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Escreva 3 n�meros, sendo 1 < A < B < C: ")
escreva("Escreva o valor de A: ")
leia(a)
escreva("Escreva o valor de B: ")
leia(b)
escreva("Escreva o valor de C: ")
Leia(c)
i := c
    se (1 > a) ou (a > b) ou (b > c) entao
       escreva("Inv�lido!!")
    senao
       para i de c > b faca
       i := c - 1
       escreva(i)
       fimenquanto
       soma := i +  b
           se soma % a = 0 entao
           divi := verdadeiro
           senao
           divi := falso
           fimse
    fimse
     se divi = verdadeiro entao
     escreva(soma)
     senao
     escreva("Invalido")
     fimse

Fimalgoritmo