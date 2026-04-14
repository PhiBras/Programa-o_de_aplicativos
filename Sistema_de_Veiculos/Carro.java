package Sistema_de_Veiculos;

public class Carro extends Veiculo{

    public Carro(String marca){
        super(marca);
    }

    @Override
    public void ligar(){
        System.out.println("O carro da marca: " + marca + "está ligando");
    }

    public void ligar(boolean chavePresencial){
        if (chavePresencial){
            System.out.println("O carro da marca: " + marca + "está ligando");
        }else{
            ligar();
        }
    }
}
