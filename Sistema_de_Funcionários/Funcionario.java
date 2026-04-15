package Sistema_de_Funcionários;

public class Funcionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }

    public double calcularSalario(double bonus){
        return salario + bonus;
    }
}
