package Atividade_16_04_2026.Exercício_4;

public class Main {
    public static void main(String[] args){

        Forma quadrado = new Quadrado(4);
        Forma circulo = new Circulo(3);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
