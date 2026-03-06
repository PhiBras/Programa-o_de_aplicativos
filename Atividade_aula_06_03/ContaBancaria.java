package Atividade_aula_06_03;

public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: não é permitido depositar valor negativo ou zero.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
            System.out.println("Saldo atual: " + saldo);
        }
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Erro: valor de saque inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente.");
            return;
        }

        saldo -= valor;

        int restante = (int) valor;

        int c100 = restante / 100;
        restante = restante % 100;

        int c50 = restante / 50;
        restante = restante % 50;

        int c20 = restante / 20;
        restante = restante % 20;

        int c10 = restante / 10;
        restante = restante % 10;

        int c5 = restante / 5;
        restante = restante % 5;

        int c2 = restante / 2;
        restante = restante % 2;

        int c1 = restante;

        System.out.println("Saque realizado: " + valor);
        System.out.println("Cédulas usadas:");

        if (c100 > 0) System.out.println(c100 + " cédulas de 100");
        if (c50 > 0) System.out.println(c50 + " cédulas de 50");
        if (c20 > 0) System.out.println(c20 + " cédulas de 20");
        if (c10 > 0) System.out.println(c10 + " cédulas de 10");
        if (c5 > 0) System.out.println(c5 + " cédulas de 5");
        if (c2 > 0) System.out.println(c2 + " cédulas de 2");
        if (c1 > 0) System.out.println(c1 + " cédulas de 1");

        System.out.println("Saldo restante: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}