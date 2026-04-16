package Atividade_16_04_2026.Exercício_9;

class ImpressoraLaser implements Impressora {

    @Override
    public void imprimir(String texto) {
        System.out.println("Impressora a laser: " + texto);
    }
}