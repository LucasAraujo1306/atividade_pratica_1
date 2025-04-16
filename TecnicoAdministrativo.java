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
        super.exibirDados();
        System.out.println("setor: "+setor);
        System.out.println("cargo: "+cargo);

    }
}
