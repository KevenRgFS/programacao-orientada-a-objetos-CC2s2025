public abstract class Material {

    private String titulo;
    private Integer anoPublicado;

    public abstract void descricao();
    
    public Material(String titulo, Integer anoPublicado)
    {
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoPublicado() {
        return this.anoPublicado;
    }

    public void setAnoPublicado(Integer anoPublicacao) {
        this.anoPublicado = anoPublicacao;
    }
    
}