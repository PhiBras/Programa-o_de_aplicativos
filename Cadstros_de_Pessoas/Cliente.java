package Cadstros_de_Pessoas;

public class Cliente extends Pessoa {

    String email;

    public Cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Email: " + email);
    }
}
