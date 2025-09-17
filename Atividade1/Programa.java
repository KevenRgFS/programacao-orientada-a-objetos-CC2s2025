public class Programa 
{
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    //private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer quantidadeOperacoes)
    {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        //this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocadaInteger()
    {
        return this.memoriaRAMAlocada;
    }
    
    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada)
    {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

        public Integer getSSDOcupado()
    {
        return this.SSDOcupado;
    }
    
    public void setSSDOcupad(Integer SSDOcupado)
    {
        this.SSDOcupado = SSDOcupado;
    }

    /*public Integer getNucleos()
    {
        return this.nucleos;
    }
    
    public void setNucleos(Integer nucleos)
    {
        this.nucleos = nucleos;
    }*/

    public Integer getQuantidadeOperacoes()
    {
        return this.quantidadeOperacoes;
    }
    
    public void setQuantidadeOperacoes(Integer quantidadeOperacoes)
    {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}
