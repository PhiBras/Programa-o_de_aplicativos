package Sistema_de_gestão_de_pessoas_e_pagamentos;

public class Cliente extends Pessoa{
    private double limiteCredito;

    public Cliente(String nome, String cpf, double limiteCredito){
        super(nome, cpf);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito(){
        return limiteCredito;
    }
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Limite de Crédito: " + limiteCredito);
    }
}