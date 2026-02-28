package Lista_de_exercícios_variáveis.Nível_6;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Média final: " + media);
    }
}
