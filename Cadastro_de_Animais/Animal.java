package Cadastro_de_Animais;

public class Animal {

    String nome;
    double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void mostrarAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
    }
}
