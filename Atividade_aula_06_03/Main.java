package Atividade_aula_06_03;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345", "João Silva", 1000);

        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.depositar(500);
        conta.depositar(-100); // teste inválido

        conta.sacar(256);
        conta.sacar(2000); // teste saldo insuficiente

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}