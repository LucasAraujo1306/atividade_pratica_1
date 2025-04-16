import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Testando a classe Aluno
        Aluno aluno1 = new Aluno(
                "Maria Silva",
                20,
                "123.456.789-00",
                "20231010",
                "Engenharia de Software"
        );
        aluno1.adicionarDisciplina("Cálculo I");
        aluno1.adicionarDisciplina("Programação Orientada a Objetos");
        aluno1.adicionarDisciplina("Física Geral");

        System.out.println("--- Dados do Aluno Antes da Troca ---");
        aluno1.exibirDados();
        System.out.println();

        // Removendo uma disciplina
        aluno1.removerDisciplina("Física Geral");
        System.out.println();

        // Adicionando uma nova disciplina
        aluno1.adicionarDisciplina("Álgebra Linear");
        System.out.println();

        System.out.println("--- Dados do Aluno Depois da Troca ---");
        aluno1.exibirDados();
        System.out.println();

        // Testando a remoção de uma disciplina inexistente
        aluno1.removerDisciplina("Química");
        System.out.println();


        // Testando a classe Professor
        Professor professor1 = new Professor(
                "Dr. João Pereira",
                45,
                "987.654.321-11",
                "SIAPE12345",
                "Banco de Dados"
        );

        System.out.println("--- Dados do Professor ---");
        professor1.exibirDados();
        System.out.println();

        // Testando a classe TecnicoAdministrativo
        TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo(
                "Ana Souza",
                35,
                "111.222.333-44",
                "Setor de TI",
                "Analista de Sistemas"
        );

        System.out.println("--- Dados do Técnico Administrativo ---");
        tecnico1.exibirDados();
        System.out.println();

        // Exemplo de modificação usando setters
        aluno1.setCurso("Ciência da Computação");
        System.out.println("--- Dados do Aluno Após Mudança de Curso ---");
        aluno1.exibirDados();
        System.out.println();

        professor1.setDisciplina("Desenvolvimento Web");
        System.out.println("--- Dados do Professor Após Mudança de Disciplina ---");
        professor1.exibirDados();
        System.out.println();

        tecnico1.setSetor("Secretaria Acadêmica");
        System.out.println("--- Dados do Técnico Administrativo Após Mudança de Setor ---");
        tecnico1.exibirDados();
        System.out.println();
    }
}
