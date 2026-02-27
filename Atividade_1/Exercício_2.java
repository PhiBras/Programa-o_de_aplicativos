import java.util.Scanner;

public class Exercício_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[4];
        int somaPares = 0;
        int i = 0;

        while (i < 4) {
            try {
                System.out.print("Digite um número inteiro: ");
                vetor[i] = Integer.parseInt(scanner.nextLine());

                if (vetor[i] % 2 == 0) {
                    somaPares += vetor[i];
                }

                i++;
            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite apenas números inteiros.");
            }
        }

        System.out.println("Soma dos números pares = " + somaPares);

        scanner.close();
    }
}