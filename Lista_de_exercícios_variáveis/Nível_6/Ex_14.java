package Lista_de_exercícios_variáveis.Nível_6;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}