package Lista_de_exercícios_variáveis.Nível_5;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        char inicial = sc.next().charAt(0);
        System.out.println("Letra inicial: " + inicial);
    }
}