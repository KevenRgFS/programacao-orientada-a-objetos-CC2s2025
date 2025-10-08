public class Revista extends Material 
{

    private Integer edicao;

    public void setEdicao(Integer edicao)
    {
        this.edicao = edicao;
    }

    public Integer getEdicao()
    {
        return this.edicao;
    }

    public Revista(String titulo, int anoPublicado, Integer edicao)
    {
        super(titulo, anoPublicado);
        this.edicao = edicao;
    }

    @Override
    public void descricao()
    {
        System.out.println("Título: " + getTitulo());
        System.out.println("Publicação: " + getAnoPublicado());
        System.out.println("Edicao: " + getEdicao());
    }
}


