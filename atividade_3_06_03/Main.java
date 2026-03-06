package atividade_3_06_03;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Carlos");

        double[] notas = {8.5, 7.0, 6.5, 9.0};

        aluno.setNotas(notas);

        double media = aluno.calcularMedia();

        aluno.resultado(media);
    }
}