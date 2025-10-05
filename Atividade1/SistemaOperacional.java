public class SistemaOperacional {
    
    private Computador computador;

    public SistemaOperacional(Computador computador)
    {
        this.computador  = computador;
    }

    public Computador getComputador()
    {
        return this.computador;
        
    }

    public void setComputador(Computador computador)
    {
        this.computador  = computador;
    }  

    public Boolean executarPrograma(Programa p)
    {
        if(p.getSSDOcupado() > computador.getSSD())
        {
            System.out.println("Erro: SSD insuficiente para instalar o programa.");
            return false;
        }
        if(p.getMemoriaRAMAlocadaInteger() > computador.getMemoriaRAM())
        {
            System.out.println("Erro: memoria RAM insuficiente para executar o programa.");
            return false;
        }
        Double tempoExecucao = (double) p.getQuantidadeOperacoes() / (computador.getOpe_por_seg() * computador.getNucleos());
        
        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução estimado: " + tempoExecucao + " segundos.");
        return true;

    }
}