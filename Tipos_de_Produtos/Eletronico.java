package Tipos_de_Produtos;

public class Eletronico extends Produto {

    int garantia;

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Garantia: " + garantia + " meses");
    }
}
