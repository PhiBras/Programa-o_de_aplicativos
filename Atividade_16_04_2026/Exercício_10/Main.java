package Atividade_16_04_2026.Exercício_10;

public class Main {
    public static void main(String[] args) {

        Arquivo a1 = new ArquivoTexto();
        Arquivo a2 = new ArquivoImagem();

        a1.abrir();
        a1.fechar();

        a2.abrir();
        a2.fechar();
    }
}