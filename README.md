# Teste Prático POO - Documentação para Teste de Processo Seletivo

## Desafio Proposto

O teste de processo seletivo tem como foco a aplicação dos conceitos de Programação Orientada a Objetos 
para a resolução de um cenário onde se deve ser feito o controle e gestão da bonificação dos funcionários. 

## Abordagem e Raciocínio

### Visão Geral do Problema

O problema proposto envolve a modelagem de funcionários em uma empresa, cada um ocupando um cargo específico com salários e benefícios distintos. Além disso, há o registro de vendas para os vendedores ao longo dos meses. A tarefa é implementar métodos em Java que permitam realizar diversas análises sobre os pagamentos dos funcionários e suas performances mensais.

### Modelagem de Cargos

1. **Secretário:**
   - Salário fixo de R$ 7000,00.
   - Recebe um benefício anual de R$ 1000,00 multiplicado pelo número de anos de serviço.
   - Adicional de 20% sobre o salário.

2. **Vendedor:**
   - Salário fixo de R$ 12000,00.
   - Recebe um benefício anual de R$ 1800,00 multiplicado pelo número de anos de serviço.
   - Adicional de 30% sobre o valor vendido.

3. **Gerente:**
   - Salário fixo de R$ 20000,00.
   - Recebe um benefício anual de R$ 3000,00 multiplicado pelo número de anos de serviço.
   - Não tem benefícios adicionais.

### Informações dos Funcionários
- Existem diferentes funcionários, cada um ocupando um cargo específico.
- Os dados de cada funcionário foram mockados em classes Enums.

### Registro de Vendas
- O registro de vendas mostra o desempenho dos vendedores ao longo dos meses.
- Os dados de vendas se relacionam com o funcionário (vendedor).
- Os dados foram também mockados com classes Enums.

### Objetivos dos Métodos

1. **Total Pago (Salário e Benefício):**
   - Calcular o valor total pago (salário e benefício) a uma lista de funcionários em um determinado mês.

2. **Total Pago Somente em Salários:**
   - Calcular o total pago somente em salários a uma lista de funcionários em um determinado mês.

3. **Total Pago em Benefícios:**
   - Calcular o total pago em benefícios a uma lista de funcionários que recebem benefícios em um determinado mês.

4. **Funcionário com Maior Pagamento no Mês:**
   - Identificar o funcionário que recebeu o valor mais alto no mês, considerando salários e benefícios.

5. **Funcionário com Maior Benefício no Mês:**
   - Identificar o funcionário que recebeu o valor mais alto em benefícios no mês.

6. **Vendedor com Maior Volume de Vendas:**
   - Identificar o vendedor que mais vendeu em um determinado mês.

### Estratégia de Implementação

**A estratégia adotada para resolver o problema envolveu os seguintes passos:**

## 1. Análise do Problema
Inicialmente, foi feita uma análise detalhada do problema proposto para entender as suas nuances e requisitos.

## 2. Decisões Arquiteturais

### 2.1. `common`
Neste pacote, reunimos classes e utilitários compartilhados globalmente no projeto. A inclusão de elementos comuns aqui permite a reutilização de código em diferentes partes do sistema, contribuindo para uma abordagem mais coesa.

### 2.2. `data`
O pacote `data` foi projetado para lidar com o armazenamento e manipulação de dados essenciais ao funcionamento do sistema. Aqui, encontram-se classes que representam modelos fundamentais, como definições de funcionários e registros de vendas.

### 2.3. `model`
No pacote `model`, concentramos as classes responsáveis por representar os modelos de negócios. Essas classes encapsulam a lógica da molegagem relacionada ao domínio do problema.

### 2.4. `service`
O pacote `service` abriga classes encarregadas de implementar a lógica de negócios e fornecer serviços específicos. Aqui são implementados métodos cruciais, como cálculo de pagamentos e análise de desempenho, garantindo uma separação clara de responsabilidades.

A estruturação do código desta maneira segue um modelo organizacional que facilita a manutenção, escalabilidade e compreensão do projeto. A clara distinção entre pacotes permite uma expansão mais eficiente do sistema, refletindo o compromisso com uma arquitetura eficiente e modular.

### 3. Implementação Passo a Passo

A implementação do projeto seguiu uma abordagem dividida em etapas para garantir uma progressão estruturada e eficiente. Cada etapa contribuiu para a construção gradual do sistema, iniciando pela modelagem dos dados até a definição e aplicação das regras de negócio.

#### 3.1. Modelagem dos Dados

A primeira etapa concentrou-se na estruturação da modelagem dos dados, definindo as classes essenciais para representar funcionários, cargos e registros de vendas. Essa etapa estabeleceu a base conceitual do sistema, identificando as principais entidades e suas relações.

#### 3.2. Mockagem de Dados em Enums

Com a estrutura de dados definida, a próxima etapa envolveu a criação de Enums para simular dados fictícios. Essa abordagem permitiu a geração rápida de dados de exemplo para facilitar os testes iniciais do sistema. Os Enums foram utilizados para representar diferentes cargos, meses, e outras informações relevantes.

#### 3.3. Implementação das Regras de Negócio

A fase subsequente focou na implementação das regras de negócio. Nesta

 etapa, foram desenvolvidas as lógicas específicas para o cálculo de salários, benefícios, análise de desempenho e demais funcionalidades relacionadas aos requisitos do projeto. A integração dessas regras consolidou a funcionalidade do sistema.

Ao dividir a implementação em etapas claras e progressivas, foi possível construir o projeto de maneira organizada e coerente. Essa abordagem facilitou a identificação de eventuais problemas, permitindo a realização de testes e validações ao final de cada etapa para garantir a robustez e eficácia do sistema.

## Conclusão

O desenvolvimento do projeto proporcionou aprendizados significativo ao reforçar a importância do grande pilar que é a Programação Orientada a Objetos em desenvolvimento Java.

## Contato

Para eventuais dúvidas ou esclarecimentos, estou totalmente disponível.

Agradeço pela oportunidade de participar do processo seletivo e estou à disposição para qualquer feedback ou discussão sobre o projeto.
