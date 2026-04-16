package Atividade_16_04_2026.Exercício_7;

public class Correios  implements Entrega{

    @Override
    public double calcularFrete(double peso){
        return peso * 5.0;
    }
}
