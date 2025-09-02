public class Radar
{
    public String modelo;
    public int velocidade_limite;
    public String localizacao;

    public void notificacao(int velocidade_detectada, String placa)
    {
        System.out.println("Limite de Velocidade: " + this.velocidade_limite);
        System.out.println("Velocidade Detectada: " + velocidade_detectada);
        System.out.println("Placa: " + placa);
    }

    public void velocidade_apurada(Carro c)
    {
        if(c.velocidade > this.velocidade_limite)
        {
            notificacao(c.velocidade, c.placa);
        }
    }
}
