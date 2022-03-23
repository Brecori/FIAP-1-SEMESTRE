Algoritmo "ABSOMA"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2022
Var
// Seção de Declarações das variáveis 
i, a, b: Inteiro
soma, mult: inteiro


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Escreval("Informe o valor de A e B: ")
   leia(a, b)
   
   i:=1
   soma := 0
   mult := 1
   
   para i de A ate B faca
    se (i mod 2 = 0) entao
    soma := soma + i
    senao
    mult := mult * i
    fimse
   
   fimpara
   
   Escreval("Soma = ",soma)
   Escreval("Mult = ",mult)



Fimalgoritmo