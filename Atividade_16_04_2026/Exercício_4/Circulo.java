package Atividade_16_04_2026.Exercício_4;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return raio * raio;
    }
}
