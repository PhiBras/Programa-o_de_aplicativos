package Sistema_de_Conta_Bancária;

public class ContaPoupanca extends Conta{

    public  ContaPoupanca(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque Conta Poupança. Saldo: " + saldo);
        }else {
            System.out.println("Saldo insuficiente na Poupança");
        }
    }

    @Override
    public void sacar(double valor, double taxa){
        double total = valor + taxa;

        if (total <= saldo){
            saldo -= total;
            System.out.println("Saque com taxa na Poupança. Saldo: " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
