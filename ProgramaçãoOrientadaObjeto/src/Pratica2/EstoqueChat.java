package Pratica2;

public class EstoqueChat {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public EstoqueChat() {}

    public EstoqueChat(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void darBaixa(int qtde) {
        int novaQtd = this.qtdAtual - qtde;
        if (novaQtd < 0) {
            System.out.println("Não é possível dar baixa em quantidade maior do que a quantidade atual.");
        } else {
            this.qtdAtual = novaQtd;
        }
    }

    public String mostra() {
        return "Produto: " + this.nome + " - Quantidade atual: " + this.qtdAtual + " - Quantidade mínima: " + this.qtdMinima;
    }

    public boolean precisaRepor() {
        return this.qtdAtual <= this.qtdMinima;
    }

    public static void main(String[] args) {
        EstoqueChat estoque = new EstoqueChat("Arroz", 20, 5);
        System.out.println(estoque.mostra()); // Produto: Arroz - Quantidade atual: 20 - Quantidade mínima: 5

        estoque.darBaixa(10);
        System.out.println(estoque.mostra()); // Produto: Arroz - Quantidade atual: 10 - Quantidade mínima: 5

        System.out.println(estoque.precisaRepor()); // false

        estoque.darBaixa(10);
        System.out.println(estoque.mostra()); // Produto: Arroz - Quantidade atual: 0 - Quantidade mínima: 5

        System.out.println(estoque.precisaRepor()); // true
    }
}
