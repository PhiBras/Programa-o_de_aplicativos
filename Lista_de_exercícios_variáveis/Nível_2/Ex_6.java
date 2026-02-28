package Lista_de_exercícios_variáveis.Nível_2;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;

        System.out.println("Média: " + media);
    }
}
