// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // Testando a classe Aluno
//         Aluno aluno1 = new Aluno(
//                 "Maria Silva",
//                 20,
//                 "123.456.789-00",
//                 "20231010",
//                 "Engenharia de Software"
//         );
//         aluno1.adicionarDisciplina("Cálculo I");
//         aluno1.adicionarDisciplina("Programação Orientada a Objetos");
//         aluno1.adicionarDisciplina("Física Geral");

//         Aluno aluno2 = new Aluno(
//                 "João Silva", 
//                 20, 
//                 "123.456.789-00", 
//                 "202311234", 
//                 "Ciência da Computação"
//         );
//         aluno2.adicionarDisciplina("Programação Orientada a Objetos");
//         aluno2.adicionarDisciplina("Estrutura de Dados");
//         aluno2.setBolsista(true);


//         System.out.println("--- Dados do Aluno Antes da Troca ---");
//         aluno1.exibirDados();
//         System.out.println();
//         aluno2.exibirDados();
//         System.out.println();

//         // Removendo uma disciplina
//         aluno1.removerDisciplina("Física Geral");
//         System.out.println();

//         // Adicionando uma nova disciplina
//         aluno1.adicionarDisciplina("Álgebra Linear");
//         System.out.println();

//         System.out.println("--- Dados do Aluno Depois da Troca ---");
//         aluno1.exibirDados();
//         System.out.println();

//         // Testando a remoção de uma disciplina inexistente
//         aluno1.removerDisciplina("Química");
//         System.out.println();


//         // Testando a classe Professor
//         Professor professor1 = new Professor(
//                 "Dr. João Pereira",
//                 45,
//                 "987.654.321-11",
//                 "SIAPE12345",
//                 "Banco de Dados"
//         );

//         Professor professor2 = new Professor(
//                 "Maria Oliveira", 
//                 35, 
//                 "987.654.321-00", 
//                 "SIAPE123456", 
//                 "Programação Orientada a Objetos");

//         System.out.println("--- Dados do Professor ---");
//         professor1.exibirDados();
//         System.out.println();

//         professor2.exibirDados();
//         System.out.println();
//         // Testando a modificação de dados do professor 
//         professor1.setDisciplina("Inteligência Artificial");
//         System.out.println("--- Dados do Professor Após Mudança de Disciplina ---");
//         professor1.exibirDados();
//         System.out.println();

//         // Testando a classe TecnicoAdministrativo
//         TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo(
//                 "Ana Souza",
//                 35,
//                 "111.222.333-44",
//                 "Setor de TI",
//                 "Analista de Sistemas"
//         );

//         TecnicoAdministrativo tecnico2 = new TecnicoAdministrativo(
//                 "Carlos Souza", 
//                 42, 
//                 "456.123.789-00", 
//                 "TI", 
//                 "Analista de Sistemas"
//         );

//         System.out.println("--- Dados do Técnico Administrativo ---");
//         tecnico1.exibirDados();
//         System.out.println();
//         tecnico2.exibirDados();
//         System.out.println();
//         // Testando a modificação de dados do técnico administrativo

//         // Exemplo de modificação usando setters
//         aluno1.setCurso("Ciência da Computação");
//         System.out.println("--- Dados do Aluno Após Mudança de Curso ---");
//         aluno1.exibirDados();
//         System.out.println();

//         professor1.setDisciplina("Desenvolvimento Web");
//         System.out.println("--- Dados do Professor Após Mudança de Disciplina ---");
//         professor1.exibirDados();
//         System.out.println();

//         tecnico1.setSetor("Secretaria Acadêmica");
//         System.out.println("--- Dados do Técnico Administrativo Após Mudança de Setor ---");
//         tecnico1.exibirDados();
//         System.out.println();
//     }
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Calcular módulo 3 da SUA matrícula para determinar a coleção
        String minhaMatricula = "202403322439"; // Substitua pela SUA matrícula
        int soma = 0;
        for (char c : minhaMatricula.toCharArray()) {
            if (Character.isDigit(c)) {
                soma += Character.getNumericValue(c);
            }
        }
        int resultado = soma % 3;
        
        System.out.println("Cálculo do critério de armazenamento:");
        System.out.println("Soma dos dígitos da matrícula " + minhaMatricula + ": " + soma);
        System.out.println(soma + " % 3 = " + resultado);
        System.out.println("Coleção selecionada: " + 
            (resultado == 0 ? "List" : resultado == 1 ? "Set" : "Map"));
        
        // 2. Criar instâncias
        Aluno aluno = new Aluno("João Silva", 20, "123.456.789-00", "202311111", "Ciência da Computação");
        aluno.adicionarDisciplina("Programação Orientada a Objetos");
        aluno.adicionarDisciplina("Estrutura de Dados");
        aluno.setBolsista(true);
        
        Professor professor = new Professor("Maria Souza", 45, "987.654.321-00", "1234567", "Programação Orientada a Objetos");
        
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Carlos Oliveira", 35, "456.789.123-00", "TI", "Analista de Sistemas");
        
        // 3. Usar a coleção determinada pelo critério
        List<Pessoa> lista = new ArrayList<>();
        Set<Pessoa> conjunto = new HashSet<>();
        Map<String, Pessoa> mapa = new HashMap<>();
        
        // 4. Adicionar objetos à coleção apropriada
        switch(resultado) {
            case 0:
                lista.add(aluno);
                lista.add(professor);
                lista.add(tecnico);
                break;
            case 1:
                conjunto.add(aluno);
                conjunto.add(professor);
                conjunto.add(tecnico);
                break;
            case 2:
                mapa.put(aluno.getCpf(), aluno);
                mapa.put(professor.getCpf(), professor);
                mapa.put(tecnico.getCpf(), tecnico);
                break;
        }
        
        // 5. Exibir informações dos objetos
        System.out.println("\n=== Exibindo dados dos objetos ===");
        aluno.exibirDados();
        System.out.println("\n" + aluno.toString());
        System.out.println("HashCode: " + aluno.hashCode());
        
        professor.exibirDados();
        System.out.println("\n" + professor.toString());
        System.out.println("HashCode: " + professor.hashCode());
        
        tecnico.exibirDados();
        System.out.println("\n" + tecnico.toString());
        System.out.println("HashCode: " + tecnico.hashCode());
        
        // 6. Verificar igualdade (teste do equals)
        System.out.println("\n=== Testando equals() ===");
        Aluno aluno2 = new Aluno("João Silva", 20, "123.456.789-00", "202322222", "Engenharia");
        System.out.println("aluno.equals(aluno2): " + aluno.equals(aluno2)); // Deve ser true (mesmo CPF)
        
        // 7. Recuperar e exibir objetos da coleção
        System.out.println("\n=== Conteúdo da coleção ===");
        switch(resultado) {
            case 0:
                System.out.println("Lista:");
                for (Pessoa p : lista) {
                    System.out.println(p);
                }
                break;
            case 1:
                System.out.println("Conjunto:");
                for (Pessoa p : conjunto) {
                    System.out.println(p);
                }
                break;
            case 2:
                System.out.println("Mapa:");
                for (Map.Entry<String, Pessoa> entry : mapa.entrySet()) {
                    System.out.println("CPF: " + entry.getKey() + " -> " + entry.getValue());
                }
                break;
        }
    }
}