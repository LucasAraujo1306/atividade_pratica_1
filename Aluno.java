import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private List<String> disciplinasMatriculadas;
    private boolean bolsista; // Adicionando o atributo extra 'bolsista'

    // Construtor que recebe as informações básicas e inicializa a lista vazia
    public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinasMatriculadas = new ArrayList<>(); // Inicializa a lista como vazia
        this.bolsista = false; // Inicializa o atributo 'bolsista' como falso
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

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }
    
    public void adicionarDisciplina(String disciplina) {
        if (disciplinasMatriculadas != null) {
            disciplinasMatriculadas.add(disciplina);
            System.out.println(disciplina + " adicionada à matrícula de " + getNome() + ".");
        } else {
            System.out.println("Lista de disciplinas não inicializada para " + getNome() + ".");
            // Isso não deve acontecer com o novo construtor
        }

    }

    public void removerDisciplina(String disciplinaParaRemover) {
        if (disciplinasMatriculadas != null && !disciplinasMatriculadas.isEmpty()) {
            if (disciplinasMatriculadas.contains(disciplinaParaRemover)) {
                disciplinasMatriculadas.remove(disciplinaParaRemover);
                System.out.println(disciplinaParaRemover + " removida da matrícula de " + getNome() + ".");
            } else {
                System.out.println(disciplinaParaRemover + " não encontrada na matrícula de " + getNome() + ".");
            }
        } else {
            System.out.println("Nenhuma disciplina matriculada para " + getNome() + ".");
        }
    }


    public void exibirBolsista() {
        System.out.println(getNome() + " é " + (bolsista ? "bolsista" : "não bolsista") + ".");
    }

    //usando a anotação @Override para sobrescrevendo o metodo exibirDados()
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        
        //Em seguida, adicionamos a exibição da matrícula e do curso específicos do Aluno
        System.out.println("Matricula: "+ matricula);
        System.out.println("Curso: "+ curso);
        System.out.println("Bolsa: " + (bolsista ? "Sim" : "Não"));
        System.out.println("Disciplinas Matriculadas: ");
        if (disciplinasMatriculadas != null && !disciplinasMatriculadas.isEmpty()) {
            for (String disciplina : disciplinasMatriculadas) {
                System.out.println("- " + disciplina);
            }
        } else {
            System.out.println("Nenhuma disciplina matriculada.");
        }
    }

    @Override
    public String toString() {
        // return "Aluno [nome=" + getNome() + ", idade=" + getIdade() + ", cpf=" + getCpf() +
        //     ", matrícula=" + matricula + ", curso=" + curso + "]";
       // Usando StringBuilder para construir a string de forma mais eficiente
        // e legível, especialmente se houver muitos atributos
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno [");
        sb.append("nome=").append(getNome());
        sb.append(", idade=").append(getIdade());
        sb.append(", cpf=").append(getCpf());
        sb.append(", matrícula=").append(matricula);
        sb.append(", curso=").append(curso);
        sb.append(", bolsista=").append(bolsista ? "Sim" : "Não");

        sb.append(", disciplinasMatriculadas=");
        if (disciplinasMatriculadas != null && !disciplinasMatriculadas.isEmpty()) {
            sb.append("[");
            for (int i = 0; i < disciplinasMatriculadas.size(); i++) {
                sb.append(disciplinasMatriculadas.get(i));
                if (i < disciplinasMatriculadas.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
        } else {
            sb.append("Nenhuma");
        }
        sb.append("]");
        return sb.toString();
    

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aluno)) return false;
        Aluno outro = (Aluno) obj;
        return getCpf().equals(outro.getCpf());
    }

    @Override
    public int hashCode() {
        return getCpf().hashCode();
    }
    
}
