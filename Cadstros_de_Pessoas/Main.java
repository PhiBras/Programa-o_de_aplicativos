package Cadstros_de_Pessoas;

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Carlos", 30, "Gerente");
        Cliente c1 = new Cliente("Ana", 25, "ana@email.com");

        System.out.println("=== Funcionário ===");
        f1.exibirDados();

        System.out.println("\n=== Cliente ===");
        c1.exibirDados();
    }

}