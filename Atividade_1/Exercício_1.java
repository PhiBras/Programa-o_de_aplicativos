package Atividade_1;

import java.util.Scanner;

public class Exercício_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[3];
        double soma = 0;
        int tentativas = 0;
        int i = 0;

        while (i < 3) {
            try {
                System.out.print("Digite um valor numérico: ");
                vetor[i] = Double.parseDouble(scanner.nextLine());
                soma += vetor[i];
                i++;
                tentativas++;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite novamente.");
                tentativas++;
            }
        }

        System.out.println("Soma = " + soma);
        System.out.println("Quantidade de tentativas = " + tentativas);

        scanner.close();
    }
}