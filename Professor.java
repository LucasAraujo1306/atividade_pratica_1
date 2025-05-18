public class Professor extends Pessoa{
    private String siape;
    private String disciplina;

    public Professor(String nome, int idade, String cpf,String siape,String disciplina){
        super(nome, idade, cpf);
        this.siape=siape;
        this.disciplina=disciplina;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        
        System.out.println("siape: "+siape);
        System.out.println("disciplina: "+disciplina);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + getCpf() + '\'' +
                ", siape='" + siape + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return getCpf().equals(professor.getCpf());
    }

    @Override
    public int hashCode() {
        return getCpf().hashCode();
    }
}
    

