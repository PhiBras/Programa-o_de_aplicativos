package Lista_de_exercícios_variáveis.Nível_7_desafio_final;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String produto = sc.nextLine();
        System.out.println("Informe o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Informe a quantidade do produto: ");
        int quantidade = sc.nextInt();
        double total = preco * quantidade;

        System.out.println("Produto: " + produto);
        System.out.println("Total a pagar: R$ " + total);
    }
}
