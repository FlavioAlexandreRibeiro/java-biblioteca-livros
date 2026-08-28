# 📚 Biblioteca de Livros

<img width="1774" height="887" alt="biblioteca" src="https://github.com/user-attachments/assets/63bf28a3-331c-456f-81de-a52a65f40522" />

## 📖 Sobre o projeto
Projeto desenvolvido em **Java** para praticar conceitos fundamentais de programação através de um sistema simples de cadastro e classificação de livros.

A aplicação recebe os dados de um livro pelo terminal e, com base no **ano de publicação** e na **quantidade de páginas**, informa sua classificação e categoria.

---

## 🚀 Funcionalidades

* 📖 Cadastro de livro pelo terminal
* ✍️ Cadastro do título
* 👤 Cadastro do autor
* 📅 Cadastro do ano de publicação
* 📄 Cadastro da quantidade de páginas
* 🏷️ Classificação do livro de acordo com sua idade
* 📚 Classificação do livro de acordo com a quantidade de páginas
* 🖥️ Exibição dos dados cadastrados no console

---

## 🧠 Regras do Sistema

### Classificação por ano de publicação

A aplicação calcula a idade do livro utilizando o ano atual definido no código.

| Idade do livro  | Classificação |
| --------------- | ------------- |
| Até 5 anos      | Lançamento    |
| Até 20 anos     | Livro Recente |
| Mais de 20 anos | Livro Antigo  |

### Categoria por quantidade de páginas

| Quantidade de páginas | Categoria   |
| --------------------- | ----------- |
| Menos de 100          | Livro Curto |
| De 100 a 299          | Livro Médio |
| 300 ou mais           | Livro Longo |

---

## 🛠️ Tecnologias utilizadas

* **Java**
* **IntelliJ IDEA**
* **Git**
* **GitHub**

---

## 📌 Conceitos praticados

Este projeto foi desenvolvido com foco na prática de conceitos básicos de Java:

* Variáveis
* Constantes
* Tipos de dados
* Entrada de dados com `Scanner`
* Estruturas condicionais `if`
* Métodos
* Retorno de métodos
* Operadores matemáticos
* Organização básica do código
* Boas práticas de nomenclatura

---

## 💻 Como executar

### 1. Clone o repositório

```bash
git clone URL_DO_SEU_REPOSITORIO
```

### 2. Acesse a pasta do projeto

```bash
cd BibliotecaLivros
```

### 3. Compile o programa

```bash
javac BibliotecaLivros.java
```

### 4. Execute

```bash
java BibliotecaLivros
```

---

## ▶️ Exemplo de execução

```text
==== BIBLIOTECA DE LIVROS ====

Digite o título do livro: O Hobbit
Digite o nome do autor: J.R.R. Tolkien
Digite o ano de publicação: 1937
Digite a quantidade de páginas: 310

==== DADOS DO LIVRO ====
Título: O Hobbit
Autor: J.R.R. Tolkien
Ano: 1937
Páginas: 310
Categoria: Livro Longo
Classificação: Livro Antigo
```

---

## 📂 Estrutura do projeto

```text
BibliotecaLivros/
└── BibliotecaLivros.java
```

---

## 🎯 Objetivo

O objetivo deste projeto é consolidar os fundamentos da linguagem **Java** por meio de uma aplicação simples e prática.

O projeto faz parte da minha jornada de estudos em **Java e desenvolvimento backend**, servindo como base para projetos futuros mais completos utilizando **Programação Orientada a Objetos, Spring Boot, APIs REST, banco de dados e outras tecnologias**.

---

## 📈 Próximos passos

Possíveis melhorias para versões futuras:

* Criar uma classe `Livro`
* Aplicar conceitos de Programação Orientada a Objetos
* Permitir o cadastro de vários livros
* Utilizar `ArrayList`
* Criar um menu interativo
* Adicionar validações de entrada
* Separar melhor as responsabilidades do sistema

---

## 👨‍💻 Autor

**Flavio Alexandre Ribeiro**

Estudante de **Java e Desenvolvimento Backend**, com foco em construção de projetos práticos para consolidação dos fundamentos da linguagem e evolução para **Spring Boot e desenvolvimento de APIs REST**.

---

⭐ Se este projeto foi útil para você, considere deixar uma estrela no repositório!
