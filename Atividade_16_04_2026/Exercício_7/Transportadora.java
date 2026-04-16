package Atividade_16_04_2026.Exercício_7;

class Transportadora implements Entrega {

    @Override
    public double calcularFrete(double peso) {
        return peso * 7.5; // exemplo de cálculo
    }
}