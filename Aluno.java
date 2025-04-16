public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    //Modificado construtor para receber matricula e curso como parâmetros
    public Aluno(String nome, int idade, String cpf,String matricula, String curso) {
        super(nome, idade, cpf);
    
        this.matricula = matricula;
        this.curso = curso;
    }

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

    //usando a anotação @Override para sobrescrevendo o metodo exibirDados()
    @Override
    public void exibirDados(){
        //Chamando o exibirDados da classePessoa
        super.exibirDados();
        //Em seguida, adicionamos a exibição da matrícula e do curso específicos do Aluno
        System.out.println("Matricula: "+ matricula);
        System.out.println("Curso: "+ curso);
    }
    
}
