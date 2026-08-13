# Factory Method e Abstract Factory - Exemplo em Java Swing

Projeto de exemplo demonstrando os padrões de projeto Factory Method e Abstract Factory em Java Swing.

## Visao geral
Este repositorio contem:

- Parte 1 (Factory Method): criacao de `Veiculo` por meio de `VeiculoFactory`, com produtos concretos `Carro` e `Moto`.
- Partes 2 e 3 (Abstract Factory): familias Fiat e Volkswagen para `Sedan`, `Hatch` e `SUV`, usando `MontadoraFactory` e fabricas concretas.

Os diagramas abaixo descrevem as estruturas implementadas no codigo.

## Diagrama de Classes - Parte 1 (Factory Method)

```mermaid
classDiagram
    %% Interface generica
    class Produto {
        <<interface>>
    }

    %% Interface principal da Parte 1
    class Veiculo {
        <<interface>>
        +exibirDetalhes() void
    }

    Produto <|-- Veiculo

    %% Produtos concretos
    class Carro {
        +exibirDetalhes() void
    }

    class Moto {
        +exibirDetalhes() void
    }

    Veiculo <|.. Carro
    Veiculo <|.. Moto

    %% Factory Method
    class VeiculoFactory {
        +criarVeiculo(tipo String) Veiculo
    }

    VeiculoFactory ..> Carro : cria
    VeiculoFactory ..> Moto : cria
```

## Diagrama de Classes - Partes 2 e 3 (Abstract Factory)

```mermaid
classDiagram
    %% Interface da Fábrica Abstrata
    class MontadoraFactory {
        <<interface>>
        +criarSedan() Sedan
        +criarHatch() Hatch
        +criarSUV() SUV
    }

    %% Fábricas Concretas
    class FiatFactory {
        +criarSedan() Sedan
        +criarHatch() Hatch
        +criarSUV() SUV
    }

    class VolksFactory {
        +criarSedan() Sedan
        +criarHatch() Hatch
        +criarSUV() SUV
    }

    MontadoraFactory <|.. FiatFactory
    MontadoraFactory <|.. VolksFactory

    %% Interfaces dos Produtos
    class Sedan {
        <<interface>>
        +exibirPortaMalas() void
    }

    class Hatch {
        <<interface>>
        +exibirConsumo() void
    }

    class SUV {
        <<interface>>
        +exibirTracao() void
    }

    %% Produtos Concretos - Fiat
    class FiatCronos {
        +exibirPortaMalas() void
    }
    class FiatArgo {
        +exibirConsumo() void
    }
    class FiatPulse {
        +exibirTracao() void
    }

    Sedan <|.. FiatCronos
    Hatch <|.. FiatArgo
    SUV <|.. FiatPulse

    %% Produtos Concretos - Volkswagen
    class VolksVirtus {
        +exibirPortaMalas() void
    }
    class VolksPolo {
        +exibirConsumo() void
    }
    class VolksTCross {
        +exibirTracao() void
    }

    Sedan <|.. VolksVirtus
    Hatch <|.. VolksPolo
    SUV <|.. VolksTCross

    %% Relação de Criação (Fábricas instanciando produtos)
    FiatFactory ..> FiatCronos : cria
    FiatFactory ..> FiatArgo : cria
    FiatFactory ..> FiatPulse : cria

    VolksFactory ..> VolksVirtus : cria
    VolksFactory ..> VolksPolo : cria
    VolksFactory ..> VolksTCross : cria
```
