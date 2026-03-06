package Atividade_2_aula_06_03;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", 180);

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Velocidade atual: " + carro1.getVelocidadeAtual());

        carro1.acelerar(50);
        System.out.println("Depois de acelerar 50: " + carro1.getVelocidadeAtual());

        carro1.acelerar(200);
        System.out.println("Depois de acelerar 200: " + carro1.getVelocidadeAtual());

        carro1.frear(30);
        System.out.println("Depois de frear 30: " + carro1.getVelocidadeAtual());

        carro1.frear(100);
        System.out.println("Depois de frear 100: " + carro1.getVelocidadeAtual());
    }
}