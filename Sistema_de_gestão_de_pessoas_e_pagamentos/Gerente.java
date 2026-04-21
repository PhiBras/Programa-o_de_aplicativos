package Sistema_de_gestão_de_pessoas_e_pagamentos;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double calcularPagamento(){
        return getSalario() * 1.20;
    }
}