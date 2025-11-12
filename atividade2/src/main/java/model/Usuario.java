package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("usuario")
public class Usuario extends Pessoa{
    private Integer matricula;

    protected Usuario(){}

    public Usuario(String nome, String email, Integer matricula){
        super(nome, email);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("e-mail: " + this.getEmail());
        System.out.println("Matrícula: " + this.matricula);
    }

}