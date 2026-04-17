package Sistema_de_Formas;

public class Main {
    public static void main(String[] args){

        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(5,3);

        System.out.println("Área do Quadrado:  " + quadrado.calcularArea());
        System.out.println("Área do Retangulo: " + retangulo.calcularArea());

        System.out.println("Área do Quadrado sobracarregado: " + quadrado.calcularArea(6));
        System.out.println("Àrea do Retangulo sobreacarregada: " + retangulo.calcularArea(7,2));
    }
}