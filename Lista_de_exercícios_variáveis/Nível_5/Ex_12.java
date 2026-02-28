package Lista_de_exercícios_variáveis.Nível_5;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = sc.next().charAt(0);
        System.out.println("Caractere digitado: " + caractere);
    }
}
