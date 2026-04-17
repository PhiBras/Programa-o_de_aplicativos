package Sistema_de_Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Carlos");
        Aluno a = new Aluno("João");
        Professor prof = new Professor("Maria");

        p.apresentar();
        a.apresentar();
        prof.apresentar();

        System.out.println("-----");

        p.apresentar("Prazer em te conhecer!");
        a.apresentar("E aí!");
        prof.apresentar("Sejam bem-vindos!");
    }
}