package Sistema_de_Formas;

public class Quadrado extends Forma{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    public double calcularArea(double lado){
        return lado * lado;
    }
}
