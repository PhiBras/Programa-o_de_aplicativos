package Lista_de_exercícios_variáveis.Nível_3;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe a cidade que mora: ");
        String cidade = sc.nextLine();

        System.out.println(nome + " mora em " + cidade + ".");
    }
}
