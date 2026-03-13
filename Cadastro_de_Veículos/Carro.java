package Cadastro_de_Veículos;

public class Carro extends Veiculo {

    int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " + portas);
    }
}