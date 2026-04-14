package Sistema_de_Veiculos;

public class Main {
    public static void main(String[] args){

        Carro carro = new Carro("Toyota");
        Moto moto = new Moto("Honda");

        carro.ligar();
        moto.ligar();

        carro.ligar(true);
        moto.ligar(false);
    }
}
