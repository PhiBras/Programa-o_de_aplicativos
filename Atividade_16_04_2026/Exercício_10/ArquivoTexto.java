package Atividade_16_04_2026.Exercício_10;

class ArquivoTexto implements Arquivo {

    @Override
    public void abrir() {
        System.out.println("Arquivo de texto aberto");
    }

    @Override
    public void fechar() {
        System.out.println("Arquivo de texto fechado");
    }
}