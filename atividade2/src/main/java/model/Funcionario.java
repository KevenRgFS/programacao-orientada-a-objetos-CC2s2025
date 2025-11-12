package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("funcionario")
public class Funcionario extends Pessoa{
    private String cargo;

    protected Funcionario(){}

    public Funcionario(String nome, String email, String cargo){
        super(nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("e-mail: " + this.getEmail());
        System.out.println("Cargo: " + this.cargo);
    }
}