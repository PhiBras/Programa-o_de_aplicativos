package Sistema_de_Formas;

public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularArea(double base, double altura){
        return base * altura;
    }
}
