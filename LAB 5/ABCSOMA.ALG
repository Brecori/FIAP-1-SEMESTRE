Algoritmo "ABCSOMA"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2022
Var
// Seção de Declarações das variáveis 
a, b, c : real
i, soma : real
divi: logico


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Escreva 3 números, sendo 1 < A < B < C: ")
escreva("Escreva o valor de A: ")
leia(a)
escreva("Escreva o valor de B: ")
leia(b)
escreva("Escreva o valor de C: ")
Leia(c)
i := c
    se (1 > a) ou (a > b) ou (b > c) entao
       escreva("Inválido!!")
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