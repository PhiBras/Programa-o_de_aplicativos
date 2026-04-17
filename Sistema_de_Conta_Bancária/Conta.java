package Sistema_de_Conta_Bancária;

public class Conta {
    public double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado. Saldo: ");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void sacar (double valor, double taxa){
        double total = valor + taxa;
        if (total <= saldo){
            saldo -= total;
            System.out.println("Saque com taxa realizado. Saldo: " + saldo);
        }else {
            System.out.println("Saldo insuficiente com taxa");
        }
    }
}
