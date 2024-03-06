# :round_pushpin: Resolução do teste técnico da Target Sistemas
A seguir está presente a resolução das questões contidas no teste técnico para o cargo de estagiário em desenvolvimento proposto pela empresa Target Sistemas

## :one: Resolução da primeira questão
**Enunciado:**  Observe o trecho de código abaixo:
```
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);
```
Ao final do processamento, qual será o valor da variável SOMA?

**Resposta:** Ao final do processamento, o resultado da variável soma é igual a 91. O código também está presente no arquivo "Desafio_001" do código fonte.

## 2️⃣: Resolução da segunda questão
**Enunciado:** Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

**Resposta:** A resolução está presente no arquivo "Desafio_002" do código fonte.

## 3️⃣: Resolução da terceira questão
**Enunciado:** Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____

**Respostas:** 

a) O próximo número da sequência é o número 9. Para obter o valor, basta realizar a soma do número anterior mais 2.

Ex: 1 + 2 = 3 / 3 + 2 = 5

b)  O próximo número da sequência é o número 128.O número seguinte é o resultado da multiplicação do número anterior por 2.

Ex: 2 x 2 = 4 / 4 x 2 = 8 / 8 x 2 = 16

c)  O próximo número da sequência é o número 51. O número seguinte é o resultado da soma do número anterior por um número ímpar de acordo com a ordem. 

Ex: 0 + 1 = 1 / 1 + 3  = 4 / 4 + 5 = 9  

d)  O próximo número da sequência é o número 100. O número seguinte é o resultado do número par elevado ao quadrado de acordo com a sequência.

Ex: 2 ^ 2 = 4 / 4 ^ 2 = 16 / 6 ^ 2 = 36 / 8 ^ 2 = 64 / 10 ^ 2 = 100

e)  A questão em si trata-se da sequência de Fibonacci, onde cada número é a soma dos dois anteriores. 

Ex: 1 + 1 = 2 / 2 + 1 = 3 / 3 + 2 = 5

f) Ao que parece, o próximo número da sequência é o 200 por ser o próximo número que começa com a letra D. 

Ex: Dois,Doze,Dezesseis,Dezessete,Dezoito,Dezenove,Duzentos.


## 4️⃣: Resolução da quarta questão
**Enunciado:** Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

**Resposta:** Uma das alternativas é ligar um dos interruptores e esperar uns 5 minutos. Em seguida, desligá-lo e e ligar o segundo interruptor. Depois é só verificar as salas. A lâmpada apagada e quente corresponde ao primeiro interruptor, a lâmpada acesa ao segundo e a lâmpada apagada e fria ao terceiro.

## 5️⃣: Resolução da quinta questão

**Enunciado:** 5) Escreva um programa que inverta os caracteres de um string.


**IMPORTANTE:**

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

**Resposta:** A resolução está presente no arquivo "Desafio_005" do código fonte.






