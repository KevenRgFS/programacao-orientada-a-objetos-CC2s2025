public class Simulação 
{
    public static void main(String[] args)
    {
        Carro Virtus = new Carro();
        Virtus.velocidade = 0;
        Virtus.placa = "KCB1A10";
        Virtus.modelo = "highline";
        Virtus.ano = 2026;

        Radar radar = new Radar();
        radar.modelo = "Pardal";
        radar.localizacao = "Pistão Sul";
        radar.velocidade_limite = 60;

        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();
        Virtus.acelerar();

        radar.velocidade_apurada(Virtus);
        Virtus.acelerar();
        radar.velocidade_apurada(Virtus);
        Virtus.reduzir();
        radar.velocidade_apurada(Virtus);  
    }
}
