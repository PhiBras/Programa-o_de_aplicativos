package Atividade_16_04_2026.Exercício_1;

public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito();
        p1.pagar(150.50);

        Pagamento p2 = new Pix();
        p2.pagar(80.00);
    }
}