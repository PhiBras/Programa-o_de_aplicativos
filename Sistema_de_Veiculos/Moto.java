package Sistema_de_Veiculos;

public class Moto extends Veiculo{

    public Moto(String marca){
        super(marca);
    }

    @Override
    public void ligar(){
        System.out.println("A moto da marca: " + marca + "está ligando");
    }

    public void ligar(boolean chavePresencial){
        if(chavePresencial){
            System.out.println("A moto da marca: " + marca + "está ligando");
        }else{
            ligar();
        }
    }
}
