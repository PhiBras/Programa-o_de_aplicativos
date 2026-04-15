package Sistema_de_Funcionários;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularSalario(){
        return salario * 1.5;
    }

    @Override
    public double calcularSalario(double bonus){
        return (salario * 1.5) + bonus;
    }
}