public class Usuario extends Pessoa {

    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula) throws Exception {
        super(nome, email);
        this.matricula = matricula;
    
        if(nome == null || nome.length() < 1)
        {
            throw new NomeInvalidoException();
        }

        if(email == null || email.length() < 3)
        {
            throw new EmailInvalidoException();
        }
        if(matricula == null || String.valueOf(matricula).length() < 2)
        {
            Exception e = new Exception("Matrícula Inválido!");
            throw e;
        }
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }


    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Email: " + getEmail());
    }
    
}
