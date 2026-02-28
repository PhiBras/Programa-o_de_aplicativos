package Lista_de_exercícios_variáveis.Nível_1;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber o dobro: ");
        int numero = sc.nextInt();
        int dobro = numero * 2;

        System.out.println("Dobro: " + dobro);
    }
}
