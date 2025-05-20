import java.util.Objects;

public class TecnicoAdministrativo extends Pessoa{
    private String setor;
    private String cargo;

    public TecnicoAdministrativo(String nome, int idade, String cpf,String setor,String cargo){
        super(nome, idade, cpf);
        this.setor=setor;
        this.cargo=cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());

        System.out.println("setor: "+setor);
        System.out.println("cargo: "+cargo);

    }

    @Override
    public String toString() {
        return "TecnicoAdministrativo{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + getCpf() + '\'' +
                ", setor='" + setor + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TecnicoAdministrativo)) return false;
        TecnicoAdministrativo that = (TecnicoAdministrativo) o;
        return getCpf().equals(that.getCpf());
    }

    @Override
    public int hashCode() {
        return getCpf().hashCode();
    }
}
