package Atividade_16_04_2026.Exercício_9;

public class Main {
    public static void main(String[] args) {

        Impressora i1 = new ImpressoraLaser();
        Impressora i2 = new ImpressoraJatoTinta();

        i1.imprimir("Documento 1");
        i2.imprimir("Foto colorida");
    }
}