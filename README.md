# Simulador de Máquina de Café

Aplicação de terminal em Java que simula o funcionamento de uma máquina de café. Ela acompanha os ingredientes disponíveis, a quantidade de copos descartáveis e o dinheiro arrecadado. Ao comprar uma bebida, o programa verifica os recursos necessários antes de preparar o café e atualizar o estoque.

## Funcionalidades

- `buy`: prepara um espresso, latte ou cappuccino, caso haja recursos suficientes.
- `fill`: adiciona água, leite, grãos de café e copos ao estoque.
- `take`: retira todo o dinheiro acumulado na máquina.
- `remaining`: mostra o estoque e o dinheiro disponíveis.
- `exit`: encerra o programa.

| Bebida | Água | Leite | Grãos de café | Preço |
| --- | ---: | ---: | ---: | ---: |
| Espresso | 250 ml | 0 ml | 16 g | $4 |
| Latte | 350 ml | 75 ml | 20 g | $7 |
| Cappuccino | 200 ml | 100 ml | 12 g | $6 |

Cada bebida também consome um copo descartável. O estoque inicial contém 400 ml de água, 540 ml de leite, 120 g de grãos de café, 9 copos e $550.

## Como executar

É necessário ter o JDK instalado. Na pasta do projeto, execute:

```powershell
mkdir out
javac -d out CoffeeMachine.java
java -cp out machine.CoffeeMachine
```

O programa apresenta o menu `buy`, `fill`, `take`, `remaining` e `exit`. Para comprar, informe `buy` e depois o número da bebida: `1` para espresso, `2` para latte ou `3` para cappuccino. O programa mantém os dados apenas durante a execução; ao reiniciá-lo, o estoque e o dinheiro voltam aos valores iniciais.

## Estrutura

- `CoffeeMachine.java`: código-fonte do simulador, no pacote `machine`.
