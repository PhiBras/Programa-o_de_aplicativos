package Sistema_de_Animais;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au Au");
    }

    public void emitirSom(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(nome + " faz: Au Au");
        }
    }
}
