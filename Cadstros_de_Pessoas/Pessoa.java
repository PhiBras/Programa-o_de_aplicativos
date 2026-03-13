package Cadstros_de_Pessoas;

public class Pessoa {
    String nome;
    int idade;

    public  Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}