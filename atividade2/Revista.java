public class Revista extends Material 
{

    private String edicao;

    public void setEdicao(String edicao)
    {
        this.edicao = edicao;
    }

    public String getEdicao()
    {
        return this.edicao;
    }

    public Revista(String titulo, int anoPublicado, int edicao)
    {
        super(titulo, anoPublicado);
    }

    @Override
    public void descricao()
    {
        System.out.println("Título: " + getTitulo());
        System.out.println("Publicação: " + getAnoPublicado());
        System.out.println("Edicao: " + getEdicao());
    }
}


