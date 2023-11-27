public class ServidorInativo extends Servidor {

    public ServidorInativo(String cpf, String nome, String orgao, double totalLiquido) {
        super(cpf, nome, orgao, totalLiquido,11, 2023, false); // `false` indica que o servidor está inativo
    }

    // Métodos específicos para servidores inativos, se necessário
    // ...
}
