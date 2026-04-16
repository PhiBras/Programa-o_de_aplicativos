package Atividade_16_04_2026.Exercício_4;

public class Quadrado implements Forma{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
