package Tipos_de_Produtos;

public class Alimento extends Produto {

    String dataValidade;

    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Data de validade: " + dataValidade);
    }
}

