package Sistema_de_Pessoa;

public class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Oi, eu sou o aluno " + nome);
    }
}