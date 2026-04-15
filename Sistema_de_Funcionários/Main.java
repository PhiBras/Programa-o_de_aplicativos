package Sistema_de_Funcionários;

public class Main {
    public static void main(String[] args){

        Funcionario f = new Funcionario("João", 2000);
        Gerente g = new Gerente("Maria", 5000);
        Estagiario e = new Estagiario("Luca", 1500);

        System.out.println("Funcionario: " + f.nome);
        System.out.println(f.calcularSalario());
        System.out.println(f.calcularSalario(300));

        System.out.println("\nGerente: " + g.nome);
        System.out.println(f.calcularSalario());
        System.out.println(f.calcularSalario(1000));

        System.out.println("\nEstagiario: " + e.nome);
        System.out.println(f.calcularSalario());
        System.out.println(f.calcularSalario(200));
    }
}
