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

## Missão 3
### Arquiteto Passo 3
Mateus dos Santos - Passou todas as informações e pesquisou maneiras praticas para serem realizadas
### Escritor Passo 3
Gustavo Giacoia - Desenvolveu a aplicação, criando as novas classes e ajustando da maneira necessária.
### Revisor Passo 3
André Gritten - Realizou os testes e validações da Missão 3:
"Eu sou o herói Super Prof, tenho 1.75m e minhas habilidades são [super força, voar, teleporte] Meu nome de verdade é: Lisiane Reips e meu gênero: MULHER
Eu sou o vilão Gritten Malfoy e minha altura é de 1.9m e meu gênero é:OUTRO e meu nível de ameaça é 9.
Meu nome é Mateus NPC e minha profissão é VibeCoder.
Identidade do héroi:
??? (identidade protegida)"

Essa foi a saída, mostrando que a herança está funcionando perfeitamente. Além claro, nenhum dos atributos está sendo duplicado
o super sempre é usado nos construtores e o Vilão não é subclasse do Herói pois não faz sentido na hierarquia, o correto seria ele ser um personagem, que é a classe pai para todas as outras.
---
## Missão 4
### Arquiteto Passo 4
André Gritten - Preparou e organizou as etapas do projeto, por classes para facilitar ao escritor
### Escritor Passo 4
Gustavo Giacoia - Alterou todas as classes, incluindo agora a sobrecarga de métodos.
### Revisor Passo 4
Eduardo Blasczak - Saida:
"
Eu sou o herói Super Prof, tenho 1.75m e minhas habilidades são [super força, voar, teleporte] Meu nome de verdade é: Lisiane Reips e meu gênero: MULHER
Super Prof usou a habilidade: super força
Detalhes: Personagem [nome=Lisiane Reips, sexo=MULHER, altura=1.75]
----------------
Eu sou o vilão Gritten Malfoy e minha altura é de 1.9m e meu gênero é:OUTRO e meu nível de ameaça é 9.
Gritten Malfoy ataca com poder equivalente ao seu nível de ameaça (9)!
Detalhes: Personagem [nome=Gritten Malfoy, sexo=OUTRO, altura=1.9]
----------------
Meu nome é Mateus NPC e minha profissão é VibeCoder.
Mateus NPC pede socorro desesperadamente!
Detalhes: Personagem [nome=Mateus NPC, sexo=HOMEM, altura=1.8]
----------------
Testando sobrecarga de habilidades (Super-Herói):
Super Prof usou a habilidade: super força
Super Prof usou a habilidade: teleporte
Super Prof tentou usar uma habilidade em um índice inválido (10)!
Super Prof usou a habilidade: voar
Super Prof tentou usar a habilidade ficar invisível mas não a possui!
----------------
Identidade do héroi:
??? (identidade protegida)
"

O teste foi feito, e nada no Main possui if ou instanceOf, tudo está sendo feito pela sobrecarga de métodos. E caso o índice passado para o super herói seja inválido, ele lançará uma exceção.
---
## BOSS
### Arquiteto Boss
Eduardo Blasczak - Pesquisou e repassou todas as instruções para a MISSÃO BOSS

### Escritor Boss
Gustavo Giacoia - Foi criado a Classe Batalha, tudo com private e com os métodos necessários, na Main, foi feito seis personagens (2 de cada), vilão, civil e heróis.

### Revisor Boss
Gustavo Giacoia - 
Como Testador, percebi que a saída do console precisava de melhorias visuais para que os logs ficassem claros para os jogadores. Portanto, adicionei divisórias, emojis e rótulos (`[AVISO]`, `[DERROTA]`) para melhorar a experiência.

Além disso, vou explicar onde os **4 Pilares da Programação Orientada a Objetos** estão aplicados em nosso código:

1. **Abstração:** Na classe `Personagem`. Ignoramos detalhes da vida real de uma pessoa que não interessam para um jogo (como CPF, RG) e trouxemos apenas características essenciais para o domínio do sistema: `nome`, `sexo`, `altura` e a ação de `agir()`.
2. **Encapsulamento:** Usamos modificadores `private` na lista de `participantes` na classe `Batalha` e nos atributos das outras classes (`nome`, `altura`, etc.). Assim, blindamos os dados contra alterações indevidas (como alguém acessar `participantes.clear()` direto da Main). O acesso só ocorre por métodos controlados (`adicionar()`, `removerDerrotado()`).
3. **Herança:** Na classe `SuperHeroi` (que faz `extends Personagem`). O herói herda todos os atributos e métodos base do personagem sem precisarmos reescrevê-los, adicionando apenas o que é exclusivo dele (como `nomeDeGuerra` e `habilidades`).
4. **Polimorfismo:** Na classe `Batalha`, no método `iniciar()`. Temos um `for (Personagem p : participantes)` onde chamamos o método `p.agir()`. O polimorfismo faz com que, sem usarmos nenhum `if` ou `instanceof`, o Java saiba executar a versão correta do `agir()` (herói usa habilidade, vilão ataca e civil pede socorro) em tempo de execução, apenas chamando o mesmo método de forma genérica.


