package Lista_de_exercícios_variáveis.Nível_2;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Informe a quantidade comprada: ");
        int quantidade = sc.nextInt();
        double total = preco * quantidade;

        System.out.println("Total da compra: R$" + total);
    }
}
