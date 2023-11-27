import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista para armazenar servidores de ambos os tipos
        List<Servidor> servidores = new ArrayList<>();

        // Adicionar servidores à lista
        servidores.add(new ServidorAtivo("123.456.789-00", "ANA", "FINANCAS", 5500.00));
        servidores.add(new ServidorInativo("987.654.321-00", "Carlos", "RH", 3000.00));
        servidores.add(new ServidorAtivo("###.845.4##-##", "AARAO JOSE DA SILVA", "PO", 11.406));
        servidores.add(new ServidorAtivo("###.639.7##-##", "ABDENEGO MATOS SOBRAL DA SILVA", "PM", 1.864));
        servidores.add(new ServidorAtivo("###.368.1##-##", "ABDENEGO PINHEIRO DA SILVA", "PM", 6.225));
        servidores.add(new ServidorInativo("###.237.0##-##", "ABDIAS JOAO DA SILVA", "Aposentado", 2614.58));
          servidores.add(new ServidorInativo("###.680.7##-##", "ABDIAS JOSE DE SANTANA", "Pensionista", 1919.74));
         servidores.add(new ServidorInativo("###.202.3##-##", "ABDIZIA MARIA ALVES BARROS", "Aposentado", 5678.64));
             servidores.add(new ServidorInativo("###.816.3##-##", "ABEL FIRMINO DA SILVA FILHO", "Aposentado", 5554.15));


        //  todos os servidores
        System.out.println("Todos os Servidores:");
        for (Servidor servidor : servidores) {
            System.out.println(servidor);
        }

        //  servidores ativos
        System.out.println("\nServidores Ativos:");
        for (Servidor servidor : servidores) {
            if (servidor.isAtivo()) {
                System.out.println(servidor);
            }
        }

        //  servidores inativos
        System.out.println("\nServidores Inativos:");
        for (Servidor servidor : servidores) {
            if (!servidor.isAtivo()) {
                System.out.println(servidor);
            }

        }}}

      


