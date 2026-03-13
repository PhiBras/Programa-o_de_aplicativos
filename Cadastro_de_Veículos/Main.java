package Cadastro_de_Veículos;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", 2022, 4);
        Moto moto1 = new Moto("Honda", 2021, 160);

        System.out.println("=== Carro ===");
        carro1.exibirInformacoes();

        System.out.println("\n=== Moto ===");
        moto1.exibirInformacoes();
    }

}