package model;
import src.main.java.interfaces.TomadorEmprestimo;

public class Instituicao implements TomadorEmprestimo{
    private String nome;
    private String cnpj;
    private String cidade;

    public Instituicao(String nome, String cnpj, String cidade){
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
    }
                                                                                                                                                           
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Cidade: " + this.cidade);
    }
}