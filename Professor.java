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
        super.exibirDados();
        System.out.println("siape: "+siape);
        System.out.println("disciplina: "+disciplina);
    }
}
    

