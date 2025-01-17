# Conservação Marinha - Nível Avançado

## Visão Geral

A classe `ConservacaoMarinha` foi projetada para gerenciar informações fundamentais sobre a conservação de ambientes marinhos. Esta classe abstrata serve como base para classes derivadas, como `ReservaMarinha`, que implementam métodos específicos para calcular a eficiência da conservação e exibir as informações de maneira formatada.

## Estrutura da Classe

### Classe Abstrata `ConservacaoMarinha`

A classe abstrata `ConservacaoMarinha` define as seguintes propriedades e métodos:

- **Propriedades:**
  - `tipoAmbiente: String` - O tipo de ambiente marinho (ex.: Zona Litorânea, Zona Nerítica).
  - `areaProtegidaEmKm2: Double` - A área protegida em quilômetros quadrados.
  - `possuiProgramaMonitoramento: Boolean` - Indica se há um programa de monitoramento ativo.

- **Métodos Abstratos:**
  - `calcularEficienciaConservacao(): ConservacaoMarinha` - Método abstrato para calcular a eficiência da conservação.
  - `exibirInformacoes(): String` - Método abstrato para exibir as informações de conservação.

### Classe `ReservaMarinha`

A classe `ReservaMarinha` herda de `ConservacaoMarinha` e implementa os métodos abstratos:

- **Propriedades:**
  - `tipoReserva: String` - O tipo de reserva (ex.: Estações Ecológicas, Parques Nacionais).
  - `eficiencia: Double` - Valor calculado de eficiência da conservação.

- **Métodos Implementados:**
  - `calcularEficienciaConservacao(): ConservacaoMarinha` - Calcula a eficiência da conservação com base em parâmetros específicos do ambiente e da reserva.
  - `exibirInformacoes(): String` - Retorna uma string formatada com todas as informações relevantes sobre a reserva marinha, incluindo a eficiência de conservação.

## Lógica de Cálculo da Eficiência

O cálculo da eficiência de conservação em `ReservaMarinha` leva em consideração:

- A área protegida (`areaProtegidaEmKm2`) e a presença de um programa de monitoramento (`possuiProgramaMonitoramento`).
- Ajustes na eficiência baseados no tipo de reserva e no tipo de ambiente marinho.

### Entrada de Dados

O método `entradaInformacoes()` coleta dados do usuário, como o tipo de ambiente, área protegida, monitoramento e tipo de reserva. A seguir, cria uma instância de `ReservaMarinha` e exibe as informações calculadas.

## Considerações Finais

Este documento detalha a implementação e uso da classe `ConservacaoMarinha`, com foco em como utilizar herança, polimorfismo e cálculos específicos para o domínio da conservação marinha. A estrutura é robusta e adaptável para diferentes cenários e níveis de complexidade.

---

# Conservação Marinha - Nível Intermediário

## Visão Geral

Este projeto tem como objetivo criar uma aplicação para gerenciar informações sobre a conservação de ambientes marinhos. Ele utiliza conceitos de enumerações (`enum class`), herança, `companion objects`, e o uso do método `with`. Nesta versão intermediária, o foco é na estruturação básica e na coleta de dados sobre o ambiente marinho e o tipo de reserva.

## Estrutura do Código

### Enumeração `TipoAmbiente`

O enum `TipoAmbiente` define os diferentes tipos de ambientes marinhos disponíveis:

- `LITORANEA`
- `NERITICA`
- `ABATIAL`
- `ABISSAL`

### Classe Base `ConservacaoMarinha`

A classe `ConservacaoMarinha` é a base para o gerenciamento de informações sobre ambientes marinhos. Ela inclui:

- **Propriedades:**
  - `tipoAmbiente: TipoAmbiente` - O tipo de ambiente marinho.
  - `areaProtegidaEmKm2: Double` - A área protegida em quilômetros quadrados.
  - `possuirProgramaMonitoramento: Boolean` - Indica se há um programa de monitoramento ativo.
  - `detalhes: String` - Detalhes formatados sobre a conservação.

- **Métodos:**
  - `mostrarDetalhes()` - Exibe os detalhes da conservação.
  - `escolherTipoAmbiente()` (Companion Object) - Método para escolher o tipo de ambiente a partir de uma lista de opções.

### Classe `ReservaMarinha`

A classe `ReservaMarinha` herda de `ConservacaoMarinha` e adiciona a funcionalidade de definir o tipo de reserva:

- **Propriedades:**
  - `tipoReserva: String` - O tipo de reserva (ex.: Estações Ecológicas, Parques Nacionais).

- **Métodos:**
  - `definirTipoReserva(opcao: Int)` - Define o tipo de reserva com base em uma opção fornecida pelo usuário.
  - `mostrarDetalhes()` - Sobrescreve o método base para incluir o tipo de reserva nos detalhes.

## Fluxo de Execução

### Entrada de Dados

O programa solicita ao usuário que:

1. Escolha o tipo de ambiente marinho.
2. Informe o tamanho da área protegida.
3. Indique se há um programa de monitoramento ativo.
4. Escolha o tipo de reserva marinha.

### Exibição de Informações

Após a coleta dos dados, o programa:

- Cria uma instância da classe `ReservaMarinha`.
- Define o tipo de reserva baseado na escolha do usuário.
- Exibe os detalhes completos da conservação, incluindo o tipo de ambiente, a área protegida, a existência de programa de monitoramento e o tipo de reserva.

## Considerações Finais

Essa implementação intermediária fornece uma base sólida para o gerenciamento de informações sobre a conservação marinha. As funcionalidades podem ser expandidas e refinadas em níveis mais avançados, incorporando cálculos de eficiência e outras lógicas mais complexas.

---

# Conservação Marinha - Nível Iniciante

## Visão Geral

Este projeto tem como objetivo introduzir conceitos básicos de programação em Kotlin, como classes, construtores, propriedades, e métodos `get` e `set`. A aplicação gerencia informações simples sobre conservação de ambientes marinhos, exibindo dados como o tipo de ambiente, área protegida, e a existência de programas de monitoramento.

## Estrutura do Código

### Classe `ConservacaoMarinha`

A classe `ConservacaoMarinha` é responsável por armazenar e gerenciar as informações básicas sobre a conservação de um ambiente marinho. A classe possui:

- **Propriedades:**
  - `tipoAmbiente: String` - O tipo de ambiente marinho.
  - `areaProtegidaEmKm2: Double` - A área protegida em quilômetros quadrados.
  - `possuiProgramaMonitoramento: Boolean` - Indica se há um programa de monitoramento ativo.
  - `parqueNacional: String` - Propriedade com métodos `get` e `set` customizados para exibir e configurar o nome do parque nacional.

- **Construtores:**
  - **Primário:** Recebe `tipoAmbiente`, `areaProtegidaEmKm2`, e `possuiProgramaMonitoramento` como parâmetros.
  - **Secundário:** Recebe apenas `tipoAmbiente` e utiliza valores padrão para as outras propriedades.

### Fluxo de Execução

1. O programa solicita ao usuário:
   - O tamanho da área protegida.
   - Se o local possui um programa de monitoramento.

2. Uma instância da classe `ConservacaoMarinha` é criada utilizando os dados fornecidos pelo usuário.

3. O programa configura o nome do parque nacional utilizando a propriedade `parqueNacional`, demonstrando o uso dos métodos `get` e `set`.

4. As informações configuradas são exibidas no console, mostrando o uso de propriedades e construtores.

### Considerações Finais

Essa implementação é adequada para iniciantes, focando em conceitos básicos de classes, propriedades, e construtores em Kotlin. Ela prepara o terreno para níveis mais avançados, onde serão introduzidas funcionalidades mais complexas, como herança, interfaces, e cálculos de eficiência de conservação.

## Colaboradores

Este projeto foi desenvolvido com a colaboração dos seguintes membros:

- [Luiz Felipe Reis](https://github.com/DevFelipreis1)
- [Márcio Evandro](https://github.com/marevandro)
- [Waldecy Junior](https://github.com/waldecyfa)
- [Maria Isabel Clara](https://github.com/maria-isabel-clara)
- [Emanuel Borges](https://github.com/emanueleborges)

