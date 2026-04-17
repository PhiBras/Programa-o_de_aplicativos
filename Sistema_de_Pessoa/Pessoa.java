package Sistema_de_Pessoa;

public class Pessoa {
    public String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public void apresentar(String mensagem) {
        System.out.println(mensagem + " Meu nome é " + nome);
    }
}