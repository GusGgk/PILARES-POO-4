## Missao 0
### Arquiteto Passo 0
Eduardo Blasczak- Eduardo passou o passo a passo para configurar o setup
### Piloto Passo 0
Gustavo Giacoia - escreveu e commitou o primeiro setup
### Revisor Passo 0
Mateus dos Santos - executei o código validando a seguinte saida:
"
Lisiane Reips - 1 - 1.75
super força
visão de raio-x
voar
super velocidade
sopro congelante
- 1 - -300.0
  super força
  visão de raio-x
  voar
  super velocidade
  sopro congelante
"


## Missao 1
### Arquiteto Passo 1
Eduardo Blasczak - Repassou todas as instruções da Missão 1 e pesquisou a sintaxe de enum
### Piloto Passo 1
GUstavo Giacoia - Realizou as atividades e fez o commit para o revisor
### Revisor Passo 1
Mateus dos Santos - Realizou os testes e validações da Missão 1:
  Após o teste pude validar que o enumerate melhorou a saída fazendo com que invés de um número recebessemos uma descrição mais adequada do sexo do objeto instanciado. 

saída de SuperHeroi: 

"Lisiane Reips - MULHER - 1.75
super força
visão de raio-x
voar
super velocidade
sopro congelante
 - MULHER - -300.0
super força
visão de raio-x
voar
super velocidade
sopro congelante"



Não funcionou pois uma classe abstrata não pode ser instanciada
Saida Personagem:
"java: Personagem is abstract; cannot be instantiated"

---
## Missao 2

### Arquiteto Passo 2
Mateus Dos Santos - Passou todas as informações e pesquisou maneiras praticas para serem realizadas 
### Piloto Passo 2
André Gritten - seguiu as descrições e missões propostas e fez o encapsulamento no Personagem
### Revisor Passo 2
Gustavo Giacoia - Realizou o seguinte teste: Mudou a main para o construtor que o andre fez, e realizou o primeiro teste:
Lisiane Reips - MULHER - 1.75
super força
voar
teleporte
??? (identidade protegida)
Habilidades originais:
[super força, voar, teleporte]
onde foi realizado também o teste de identidade caso a pessoa tivesse uma identidade secreta.

O segundo teste foi em relação a altura e também com o lista denfensiva (copia):
Lista modificada (cópia):
[super força, teleporte, teletransporte]

Lista do objeto:
[super força, voar, teleporte]
Aqui podemos ver que o objeto original não foi modificado. Apenas a cópia foi modificada, graças ao getHabilidades que retorna uma cópia da lista.

---
