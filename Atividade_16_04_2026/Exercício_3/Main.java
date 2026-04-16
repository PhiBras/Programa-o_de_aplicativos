package Atividade_16_04_2026.Exercício_3;

public class Main {
    public static void main(String[] args) {

        Bonus gerente = new Gerente();
        Bonus vendedor = new Vendedor();

        double salario = 5000;

        System.out.println("Bônus gerente: " + gerente.calcularBonus(salario));
        System.out.println("Bônus vendedor: " + vendedor.calcularBonus(salario));
    }
}