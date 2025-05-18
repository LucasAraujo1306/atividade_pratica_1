import java.util.Objects;

//abstract: Impedir a instanciação direta: Uma classe abstrata não pode ser instanciada diretamente.
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoa(String nome, int idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    protected void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    //Override: Permite que a classe filha sobrescreva o método da classe pai, garantindo que o comportamento seja específico para cada tipo de pessoa.
    //ToString: Fornece uma representação em string da classe, útil para depuração e exibição de informações.
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    //Equals: Permite comparar duas instâncias de Pessoa para verificar se são iguais com base em seus atributos.   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(cpf, pessoa.cpf);
    }

    //HashCode: Gera um código hash para a instância da classe, útil para armazenar objetos em coleções como HashMap ou HashSet.
    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cpf);
    }

}