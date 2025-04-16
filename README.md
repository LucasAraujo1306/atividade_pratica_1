# Sistema de Cadastro de Membros da Comunidade Escolar - Atividade Prática 1

Este projeto implementa um sistema de cadastro para diferentes membros da comunidade escolar, conforme solicitado na Atividade Prática 1 da disciplina. O sistema utiliza o conceito de herança em Java para modelar as diferentes entidades (Aluno, Professor e Funcionário Técnico-Administrativo) a partir de uma classe base comum (Pessoa).

## Estrutura do Projeto

O projeto é composto pelas seguintes classes Java:

* **`Pessoa.java`**: Classe base que define os atributos comuns a todos os membros da comunidade escolar:
    * `nome` (String): Nome do membro.
    * `idade` (int): Idade do membro.
    * `cpf` (String): CPF do membro.
    * Possui construtor para inicializar os atributos e métodos getters e setters para cada atributo.
    * Contém um método `exibirDados()` que imprime as informações básicas da pessoa.

* **`Aluno.java`**: Classe derivada de `Pessoa` que representa um aluno. Possui os seguintes atributos específicos:
    * `matricula` (String): Número de matrícula do aluno.
    * `curso` (String): Nome do curso do aluno.
    * `disciplinasMatriculadas` (List\<String>): **Atributo adicional escolhido para esta classe, representando a lista das disciplinas em que o aluno está matriculado.**
    * Possui construtor para inicializar os atributos (incluindo a lista de disciplinas como uma nova `ArrayList`).
    * Implementa getters e setters para os atributos específicos.
    * Sobrescreve o método `exibirDados()` para exibir as informações do aluno, incluindo matrícula, curso e as disciplinas matriculadas.
    * Adiciona os seguintes **métodos específicos escolhidos para esta classe**:
        * `adicionarDisciplina(String disciplina)`: Adiciona uma disciplina à lista de disciplinas matriculadas.
        * `removerDisciplina(String disciplinaParaRemover)`: Remove uma disciplina da lista de disciplinas matriculadas.

* **`Professor.java`**: Classe derivada de `Pessoa` que representa um professor. Possui os seguintes atributos específicos:
    * `siape` (String): Código funcional SIAPE do professor.
    * `disciplina` (String): Disciplina que o professor leciona.
    * Possui construtor para inicializar os atributos específicos.
    * Implementa getters e setters para os atributos específicos.
    * Sobrescreve o método `exibirDados()` para exibir as informações do professor, incluindo SIAPE e disciplina.

* **`TecnicoAdministrativo.java`**: Classe derivada de `Pessoa` que representa um funcionário técnico-administrativo. Possui os seguintes atributos específicos:
    * `setor` (String): Setor de trabalho do funcionário.
    * `cargo` (String): Cargo do funcionário.
    * Possui construtor para inicializar os atributos específicos.
    * Implementa getters e setters para os atributos específicos.
    * Sobrescreve o método `exibirDados()` para exibir as informações do funcionário, incluindo setor e cargo.

* **`Main.java`**: Classe principal que demonstra a criação e manipulação dos objetos das classes definidas.
    * Instancia pelo menos um objeto de cada tipo (Aluno, Professor e TecnicoAdministrativo).
    * Atribui valores aos atributos dos objetos (tanto no construtor quanto utilizando os setters).
    * Chama o método `exibirDados()` de cada objeto para imprimir suas informações completas.
    * Chama o método específico `adicionarDisciplina()` e `removerDisciplina()` no objeto `Aluno` para demonstrar sua funcionalidade.
    * Utiliza dados inspirados na realidade da UniFBV para os exemplos.


## Observações

* Todos os atributos das classes são privados e o acesso é controlado por meio de métodos getters e setters, garantindo o encapsulamento.
* A classe `Aluno` foi escolhida para incluir um atributo adicional (`disciplinasMatriculadas`) e métodos específicos (`adicionarDisciplina()` e `removerDisciplina()`) para gerenciar as disciplinas do aluno.
* Os exemplos na classe `Main` utilizam nomes de cursos, disciplinas e setores que podem ser encontrados na UniFBV, buscando simular um cenário real.

## Autor

[Lucas Isaac Gomes de Carvalho Araujo]
[202403322439 - Matrícula]
[202403322439@alunos.unifbv.edu.br]