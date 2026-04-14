package Sistema_de_Animais;

public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " faz: Miau");
    }
}