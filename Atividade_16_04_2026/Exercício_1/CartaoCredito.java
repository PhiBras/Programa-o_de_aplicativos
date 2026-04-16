package Atividade_16_04_2026.Exercício_1;

class CartaoCredito implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " no cartão de crédito aprovado.");
    }
}