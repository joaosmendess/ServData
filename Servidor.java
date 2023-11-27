public class Servidor {
    private String cpf;
    private String nome;
    private String orgao;
    private double totalLiquido;
    private int mes;
    private int ano;
    private boolean ativo;

    public Servidor(String cpf, String nome, String orgao, double totalLiquido, int mes, int ano,boolean ativo) {
        this.cpf = cpf;
        this.nome = nome;
        this.orgao = orgao;
        this.totalLiquido = totalLiquido;
        this.mes= mes;
        this.ano = ano;
        this.ativo = ativo;
    }



    // Getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getOrgao() {
        return orgao;
    }

    public double getTotalLiquido() {
        return totalLiquido;
    }

    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public void setTotalLiquido(double totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Método toString para exibição
    @Override
    public String toString() {
        return String.format(
                "CPF: %-15s | Nome: %-30s | Categoria: %-15s | Salário: R$%,.2f",
                cpf, nome, orgao, totalLiquido
        );
    } }
