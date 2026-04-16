package Atividade_16_04_2026.Exercício_3;

public class Vendedor implements Bonus{

    @Override
    public double calcularBonus(double salario){
        return salario * 0.10;
    }
}
