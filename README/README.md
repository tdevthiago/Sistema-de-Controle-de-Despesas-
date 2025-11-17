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

## terceiro commit 0.0.3 
+----------------------+
|      Pagavel (I)     |
+----------------------+
| +registrarPagamento()|
| +estaPaga()          |
+----------------------+

            ▲
            |
+-------------------------------+
|       Despesa (abstract)      |
+-------------------------------+
| -id:int                       |
| -descricao:String             |
| -valor:double                 |
| -vencimento:LocalDate        |
| -tipo:TipoDespesa             |
| -pagamentos:List<Pagamento>   |
| #contador:int (static)        |
+-------------------------------+
| +calcularSaldo():double       |
| +estaPaga():boolean (override)|
| +adicionarPagamento()         |
+-------------------------------+
            ▲         ▲         ▲
            |         |         |
+-----------+---+ +---+---------+---+
| Transporte | | Eventual       | | Superfluo |
+-----------+---+ +---------------+ +-----------+
| +regras...    | | +regras...     | | +regras... |
+---------------+ +-----------------+ +-----------+

+--------------------------+
|      Pagamento          |
+--------------------------+
| -data:LocalDate         |
| -valor:double           |
+--------------------------+

+--------------------------+
|      TipoDespesa        |
+--------------------------+
| -id:int                 |
| -nome:String            |
+--------------------------+

+--------------------------+
|      Usuario            |
+--------------------------+
| -id:int                 |
| -login:String           |
| -senhaCript:String      |
+--------------------------+
| +criptografarSenha()    |
+--------------------------+

+--------------------------------------+
|      ControleDespesas               |
+--------------------------------------+
| +adicionarDespesa()                  |
| +listarPagas()                       |
| +listarAbertas()                     |
| +salvarEmArquivo()                   |
| +lerArquivo()                        |
+--------------------------------------+

+--------------------------------------+
|      UsuarioManager                  |
+--------------------------------------+
| +cadastrarUsuario()                  |
| +listarUsuarios()                    |
| +editarUsuario()                     |
| +salvarArquivo()                     |
+--------------------------------------+

+--------------------------------------+
|      TipoDespesaManager              |
+--------------------------------------+
| +cadastrarTipo()                     |
| +listarTipos()                       |
| +editarTipo()                        |
| +excluirTipo()                       |
+--------------------------------------+

## explicação dos codigos
# 2. Classes do Sistema (explicação detalhada)
# 2.1 – Classe Abstrata Despesa

Representa qualquer despesa cadastrada no sistema.

Atributos

int id

String descricao

double valor

LocalDate vencimento

String categoria

boolean paga

double valorPago

LocalDate dataPagamento

static int contadorDespesas

Métodos

Construtor sobrecarregado:

Despesa(String descricao, double valor)

Despesa(String descricao, double valor, LocalDate vencimento)

pagar(double valor, LocalDate data)

isPaga()

toString() sobrescrito

Métodos estáticos:

getTotalDespesasCriadas()

Regras

Não pode ser instanciada diretamente.

Subclasses herdam todos os atributos.

# 2.2 – Subclasses de Despesa (Herança)

Cada categoria específica herda de Despesa.

Classe Transporte

Sobrescreve toString()

Pode ter regras adicionais (ex.: custo por km)

Classe Alimentacao

Pode ter validação de alimentação diária

Classe Superfluo

Pode aplicar uma regra de alerta caso valor ultrapasse limite

Classe Eventual

Pode indicar gastos não recorrentes

# 2.3 – Classe Pagamento
Atributos:

int idDespesa

LocalDate dataPagamento

double valorPago

Documenta a conciliação de pagamento.

# 2.4 – Classe Usuario
Atributos:

String login

String senhaCriptografada

Métodos:

setSenha(String senha) → criptografa e salva

autenticar(String senhaDigitada)

# 3. Interfaces
Interface Pagavel

Todas as classes que podem receber pagamento devem implementá-la.

public interface Pagavel {
    void registrarPagamento(double valor, LocalDate data);
}


As classes concretas (como Transporte, Alimentação etc.) implementam essa interface, permitindo polimorfismo.

# 4. Polimorfismo Aplicado

O sistema permite que diferentes tipos de despesas sejam manipuladas como o tipo pai:

Despesa d = new Alimentacao(...);
Despesa x = new Transporte(...);


Ou usando a interface:

Pagavel p = new Superfluo(...);
p.registrarPagamento(100, LocalDate.now());

# 5. Métodos e Atributos Estáticos
Exemplos:

Despesa.contadorDespesas
Conta quantas despesas foram criadas no sistema.

Criptografia.gerarHash(String texto)
Método utilitário para gerar criptografia SHA-256.

# 6. Criptografia de Senhas

Implementada na classe Criptografia.java, usando SHA-256.

Fluxo:

Usuário digita senha

Sistema transforma senha em HASH

HASH é salvo em usuarios.txt

Na autenticação, compara o HASH da senha digitada com o HASH armazenado

Isso garante segurança mesmo usando arquivos TXT.

# 7. Persistência em Arquivos TXT

Todos os dados são gravados em /data/.

usuarios.txt
login;senhaCriptografada

despesas.txt
id;descricao;valor;vencimento;categoria;paga;valorPago;dataPagamento

tipos.txt
Transporte
Alimentacao
Superfluo
Eventual


Para ler e escrever arquivos, o sistema usa a classe:

ArquivoUtils


com métodos como:

lerArquivo(String caminho)

salvarLinha(String caminho, String texto)

sobrescreverArquivo(String caminho, List<String> linhas)

