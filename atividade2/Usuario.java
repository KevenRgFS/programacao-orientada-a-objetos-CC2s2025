public class Usuario extends Pessoa {

    private Integer matricula;

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Usuario(String nome, String email, int matricula) {
        super(nome, email);
        
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Email: " + getEmail());
    }
    
}
