package Sistema_de_Conta_Bancária;

public class Main {
    public static void main(String[] args){

        ContaCorrente corrente = new ContaCorrente(100);
        ContaPoupanca poupanca = new ContaPoupanca(100);

         corrente.sacar(20);
         poupanca.sacar(20);

         corrente.sacar(20,5);
         poupanca.sacar(20,5);
    }
}
