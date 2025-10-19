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
