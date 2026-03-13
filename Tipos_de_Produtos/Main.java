package Tipos_de_Produtos;

public class Main {

    public static void main(String[] args) {

        Eletronico e1 = new Eletronico("Notebook", 3500.00, 12);
        Alimento a1 = new Alimento("Chocolate", 8.50, "10/12/2026");

        System.out.println("=== Eletrônico ===");
        e1.mostrarProduto();

        System.out.println("\n=== Alimento ===");
        a1.mostrarProduto();
    }

}