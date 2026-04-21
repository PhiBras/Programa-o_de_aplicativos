package Sistema_de_gestão_de_pessoas_e_pagamentos;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, String cpf, double salario, double totalVendas) {
        super(nome, cpf, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularPagamento() {
        return getSalario() + (getTotalVendas() * 0.10);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Total de Vendas: " + totalVendas);
    }
}