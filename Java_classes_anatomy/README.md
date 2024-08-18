# Nome de arquivo
Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra também deve ser maiúscula, por exemplo: 

Calculadora.java | CalculadoraCientifica.java

# Nome da classe no arquivo
A classe deve possuir o mesmo nome do arquivo java, por exemplo:

// arquivo CalculadoraCientífica. java

public class CalculadoraCientífica {
    // ...
}

# Nome de variável
Todas as variáveis devem começar com letras minúsculas, mas se a palavra for composta, a primeira letra da segunda palavra deverá ser maiúscula, por exemplo:

ano | anoFabricacao

* Existe um caso para quando queremos criar uma variável que não sofrerá alteração no seu valor, para isso, escrevemos o nome da variável em maiúsculo, como por exemplo:

String BR = "Brasil" // tipo da variavel/ nome/ valor

Para a certeza de que essa variável não vá se alterar ao longo do código, use "final" antes da declaração do tipo da variável, assim:

final String BR = "Brasil"

# Caracteres permitidos

1. A variável deve conter apenas letras, underscore, cifrão ou números de 0 a 9

2. Deve OBRIGATORIAMENTE comecar por uma letra minúscula (preferencial e boa prática), underscore ou cifrão, jamais com um número.

# Declaração de variáveis 

Estrutura: Tipo | NomeDaVariavel | Atribuição (opcional em alguns casos)

int age = 19;
double height = 1.65;

* A variável sempre deve ser escrita no singular, a não ser que seja um array.

* Ao lidar com valores numéricos, atente-se ao uso dos pontos. 2.500 não representa dois mil e quinhentos, mas sim dois vírgula cinco. Para representar dois mil e quinhentos, use 2500.

* Caso vá declarar mais de uma variável do mesmo tipo, é possível simplificá-las, como por exemplo: int x = 5, y = 3, z = 1

# Declaração de métodos

Estrutura: TipoRetorno | NomeObjetivoNoInfinitivo | Parametro(s)

int somar (int numeroUm, int numeroDois)

String formatarCep (long cep)

abrirConexao(){
    //...
}

* Deverão ser nomeados como verbos e usar letra maiúscula na primeira letra de cada palavra composta a partir da segunda palavra.

# Tipos primitivos e não primitivos

- int (mais usado para valores numéricos)
- byte
- short
- long (A mesma regra do float serve para o long, com a diferença de f para l)
- float (faz-se necessário o uso do "f" junto do número, ex: float pi = 3.14f)
- double (mais usado para valores fracionários, mesma regra do float)
- boolean
- char (usado para armazenar um único caractere numérico)

* Não primitivos

- String (mais usado para textos)
- Arrays
- Classes

# System.out.

system.out.print // para mostrar textos
System.out.println // para mostrar textos e pular uma linha

# Operadores

1. Atribuição (=)

Usado para definir o valor inicial ou sobrescrever o valor de uma variável.

2. Aritméticos

Usados para realizar operações matemáticas entre valores numéricos.

+ (adição)
- (subtração)
* (multiplicação)
/ (divisão)

*OBS: O operador de adição, quando utilizado em variáveis do tipo String, realizará a concatenação, como por exemplo:

String nomeCompleto = "isabelle " + "duarte"

3. Unários

Usados junto de outros operadores aritméticos. Realizam algumas operações como incrementar(++), decrementar(--), inverter valores numéricos (- e +) e booleanos (!).

(+) Transforma um número ou expressão em positivo
(-) Transforma um número ou expressão em negativo
(++) Incrementa o valor em 1 unidade
(--) Decrementa o valor em 1 unidade
(!) Nega o valor de uma expressão booleana

4. Ternários

Sua função se resume a ser um IF de uma forma simplificada, que ocupa apenas uma linha.

Sintaxe:
<condição(booleana)> ? <comando_caso_true> : <comando_caso_false>

5. Relacionais

Avaliam a relação entre duas variaveis ou expressões, retornando um valor booleano como resultado.

- == Verifica se as variáveis são iguais
- != Verifica se as variáveis são diferentes
- >= Verifica se a variavel da esquerda é maior ou igual a da direita
- <= Verifica se a variavel da esquerda é menor ou igual a da direita
- > verifica se a variavel da esquerda é maior que a da direita
- < Verifica se a variavel da esquerda é menor que a da direita

*Para verificar se objetos e string são iguais, usamos equals, por exemplo:

nomeUm.equals(nomeDois)

6. Lógicos (tabela-verdade)

&& - Operador lógico "E"
|| - Operador lógico "OU"