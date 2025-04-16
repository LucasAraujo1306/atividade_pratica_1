import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private List<String> disciplinasMatriculadas;

    // Construtor que recebe as informações básicas e inicializa a lista vazia
    public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinasMatriculadas = new ArrayList<>(); // Inicializa a lista como vazia
    }

    //Removendo o construtor sem disciplinas, pois agora sempre inicializa com uma lista vazia
    // // Construtor completo (opcional, para já inicializar com disciplinas)
    // public Aluno(String nome, int idade, String cpf, String matricula, String curso, List<String> disciplinasMatriculadas) {
    //     super(nome, idade, cpf);
    //     this.matricula = matricula;
    //     this.curso = curso;
    //     this.disciplinasMatriculadas = disciplinasMatriculadas;
    // }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<String> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(List<String> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public void adicionarDisciplina(String disciplina) {
        if (disciplinasMatriculadas != null) {
            disciplinasMatriculadas.add(disciplina);
        } else {
            System.out.println("Lista de disciplinas não inicializada.");// Isso não deve acontecer com o novo construtor
        }

    }

    //usando a anotação @Override para sobrescrevendo o metodo exibirDados()
    @Override
    public void exibirDados(){
        //Chamando o exibirDados da classePessoa
        super.exibirDados();
        //Em seguida, adicionamos a exibição da matrícula e do curso específicos do Aluno
        System.out.println("Matricula: "+ matricula);
        System.out.println("Curso: "+ curso);
        System.out.println("Disciplinas Matriculadas: ");
        if (disciplinasMatriculadas != null && !disciplinasMatriculadas.isEmpty()) {
            for (String disciplina : disciplinasMatriculadas) {
                System.out.println("- " + disciplina);
            }
        } else {
            System.out.println("Nenhuma disciplina matriculada.");
        }
    }
    
}
