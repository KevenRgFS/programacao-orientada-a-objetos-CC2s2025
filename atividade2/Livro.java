public class Livro extends Material 
{

    private String autor;

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getAutor()
    {
        return this.autor;
    }

    public Livro(String titulo, int anoPublicado, String autor)
    {
        super(titulo, anoPublicado);
    }

    @Override
    public void descricao()
    {
        System.out.println("Título: " + getTitulo());
        System.out.println("Publicação: " + getAnoPublicado());
        System.out.println("Autor: " + getAutor());
    }
    
}
