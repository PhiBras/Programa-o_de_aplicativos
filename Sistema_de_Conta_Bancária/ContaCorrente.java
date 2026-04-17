package Sistema_de_Conta_Bancária;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.0;

        if ((valor + taxa) <= saldo) {
            saldo -= (valor + taxa);
            System.out.println("Saque Conta Corrente com taxa. Saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }

    @Override
    public void sacar(double valor, double taxa) {
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque personalizado Conta Corrente. Saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}