public class Funcionario extends Pessoa {

    private String cargo;


    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Email: " + getEmail());
    }
    
}
