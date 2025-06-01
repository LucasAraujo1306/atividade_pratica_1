# Sistema de Cadastro de Membros da Comunidade Escolar - Atividades Práticas 1 e 2

Este repositório contém o desenvolvimento das Atividades Práticas 1 e 2 da disciplina de Programacao Orientada a Objetos em Java. O objetivo é implementar um sistema de cadastro de membros da comunidade escolar utilizando conceitos de **herança**, **encapsulamento**, **sobrescrita de métodos** e **coleções genéricas**.

---

## 🏢 Atividade Prática 1

A Atividade Prática 1 consiste na criação de uma estrutura básica com herança e um método personalizado em uma das subclasses.

### Estrutura do Projeto:

* **Pessoa.java** (classe base):

  * Atributos: `nome`, `idade`, `cpf`
  * Métodos: getters/setters, `exibirDados()`

* **Aluno.java**:

  * Atributos: `matricula`, `curso`, `disciplinasMatriculadas` (List)
  * Métodos adicionais: `adicionarDisciplina(String)`, `removerDisciplina(String)`
  * Sobrescreve `exibirDados()`

* **Professor.java**:

  * Atributos: `siape`, `disciplina`
  * Sobrescreve `exibirDados()`

* **TecnicoAdministrativo.java**:

  * Atributos: `setor`, `cargo`
  * Sobrescreve `exibirDados()`

* **Main.java**:

  * Instancia um objeto de cada classe derivada
  * Exibe os dados com `exibirDados()`
  * Demonstra os métodos adicionais de `Aluno`

---

## ⚖️ Atividade Prática 2

A segunda atividade amplia o sistema, exigindo o uso de:

* Classe base **abstrata** (`Pessoa`)
* Sobrescrita de `toString()`, `equals()`, `hashCode()`
* Uso de **coleções genéricas** baseadas em um critério calculado a partir da matrícula do aluno

### Etapas Desenvolvidas:

#### 1. Classe Abstrata `Pessoa`:

* Atributos privados: `nome`, `idade`, `cpf`
* Getters e setters
* Métodos sobrescritos: `toString()`, `equals()`, `hashCode()`

#### 2. Classes Derivadas:

* **Aluno.java**: `matricula`, `curso`, `disciplinasMatriculadas`, com métodos adicionais para gerenciar disciplinas
* **Professor.java**: `siape`, `disciplina`
* **TecnicoAdministrativo.java**: `setor`, `cargo`
* Cada uma sobrescreve o método `exibirDados()` e os métodos herdados

#### 3. Critério de Armazenamento:

* Soma dos dígitos da matrícula % 3 define o tipo de coleção usada:

  * **0**: `List<Pessoa>`
  * **1**: `Set<Pessoa>`
  * **2**: `Map<String, Pessoa>` (usando o CPF como chave)

#### 4. Classe Principal `Main.java`:

* Mostra o cálculo da coleção escolhida
* Instancia objetos realistas com dados da UniFBV
* Chama `exibirDados()`, `toString()`, `equals()`, `hashCode()`
* Armazena e recupera os objetos da coleção escolhida

---

## 🎓 Conceitos Aplicados

* Programacao Orientada a Objetos: herança, encapsulamento, polimorfismo
* Coleções Java: `List`, `Set`, `Map`
* Sobrescrita de métodos padrões: `toString()`, `equals()`, `hashCode()`

---

## 👨‍🎓 Autor

**Lucas Isaac Gomes de Carvalho Araujo**
**Matrícula**: 202403322439
**Email**: [202403322439@alunos.unifbv.edu.br](mailto:202403322439@alunos.unifbv.edu.br)

> Projeto desenvolvido como parte das Atividades Práticas da disciplina de Programacao Orientada a Objetos - UniFBV
