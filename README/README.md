# Sistema de Controle de Despesas - Documentação Inicial

## Estratégia de Construção

O sistema é desenvolvido utilizando Programação Orientada a Objetos (POO) para abstrair as funcionalidades através de classes, atributos e métodos, garantindo modularidade e organização do código.

Cada funcionalidade do sistema corresponde a classes específicas:

### Classes e suas responsabilidades

- **Despesa:** Representa uma despesa, com atributos descrição, valor, data de vencimento e categoria. Possui construtores sobrecarregados para flexibilidade na criação.
- **Usuario:** Representa os usuários do sistema, contendo login e senha criptografada para segurança.
- **TipoDespesa:** Representa os tipos/categorias de despesa, permitindo gerenciamento flexível.

### Menu Principal

O menu inicial apresenta as principais opções, onde cada escolha imprime uma mensagem simples, servindo como base para implementação futura.

## Funcionalidades do Menu

- Entrar Despesa  
- Anotar Pagamento  
- Listar Despesas em Aberto no período  
- Listar Despesas Pagas no período  
- Gerenciar Tipos de Despesa  
- Gerenciar Usuários  
- Sair  

## ChangeLog - Versão 0.0.1

- Repositório criado e compartilhado com o professor.
- Menu principal implementado com mensagens simples para cada opção.
- Classes básicas criadas para representar as principais entidades do sistema.
- Estrutura inicial do projeto organizada com pastas para código-fonte e documentação.

## versão 0.0.1 – separação de prioridades, POC e projeção do MVP

## 1. Separação de Prioridades

### Prioridade Alta (MVP)
- Cadastro de despesas
- Listagem de despesas
- Persistência (arquivo JSON ou txt)
- Cálculo total de despesas

### Prioridade Média
- Relatórios detalhados
- Filtros avançados
- Interface amigável

### Prioridade Baixa
- Exportação PDF/Excel
- Temas e personalização
- Integrações externas

---

## 2. POC – Proof of Concept
A POC valida se o sistema de despesas consegue:
- Criar um objeto Despesa
- Armazenar despesas em uma lista
- Salvar e carregar dados de forma simples
- Exibir despesas no console

A POC serve apenas para testar o conceito, sem preocupação com interface ou performance.

---

## 3. MVP – Minimum Viable Product
O MVP terá:
- Classes principais (Despesa, ControleDespesas)
- Métodos essenciais (adicionar, listar, somar)
- Persistência simples (arquivo)
- Menu básico no terminal
- Fluxo funcional do usuário

Objetivo: demonstrar o funcionamento básico do sistema.