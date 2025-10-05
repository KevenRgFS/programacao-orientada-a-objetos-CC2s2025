public class Carro
{
    public String nome;
    public String modelo;
    public int ano;
    public String placa;
    public int velocidade;

    public void acelerar()
    {
        this.velocidade+=5;
    }

    public void reduzir()
    {
        if(this.velocidade > 0)
        {
            this.velocidade-=5;
        }
    }
}
