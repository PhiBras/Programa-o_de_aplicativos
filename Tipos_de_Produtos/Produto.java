package Tipos_de_Produtos;

public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}