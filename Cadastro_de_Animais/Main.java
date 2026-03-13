package Cadastro_de_Animais;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", 15.5, "Labrador");
        Gato gato1 = new Gato("Mimi", 4.2, "Branco");

        System.out.println("=== Cachorro ===");
        cachorro1.mostrarAnimal();

        System.out.println("\n=== Gato ===");
        gato1.mostrarAnimal();
    }
}