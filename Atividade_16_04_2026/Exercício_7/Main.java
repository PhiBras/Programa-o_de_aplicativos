package Atividade_16_04_2026.Exercício_7;

public class Main {
    public static void main(String[] args){

        Entrega correio = new Correios();
        Entrega transportadora = new Transportadora();

        double peso = 10;

        System.out.println("Frete Correios: " + correio.calcularFrete(peso));
        System.out.println("Frete Transportadora: " + transportadora.calcularFrete(peso));
    }
}
