package Cadastro_de_Animais;

public class Gato extends Animal {

    String cor;

    public Gato(String nome, double peso, String cor) {
        super(nome, peso);
        this.cor = cor;
    }

    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("Cor: " + cor);
    }
}