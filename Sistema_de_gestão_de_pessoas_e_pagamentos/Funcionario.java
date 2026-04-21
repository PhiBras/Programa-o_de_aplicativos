package Sistema_de_gestão_de_pessoas_e_pagamentos;

public class Funcionario extends Pessoa implements Pagavel {
    private double salario;

    public Funcionario() {}

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + salario);
    }
}