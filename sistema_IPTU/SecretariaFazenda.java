package sistema_IPTU;

public class SecretariaFazenda 
{
        public static void main(String[] args)
        {
            Municipio Brasilia = new Municipio("Brasilia", "DF", 65.5);

            Apartamento apt = new Apartamento("Brasilia", 52.0, 1, true)

            System.out.println("IPTU: R$: " + apt.calcular_IPTU());

        }
}
