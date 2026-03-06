package atividade_3_06_03;

public class Aluno {

    private String nome;
    private double[] notas;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNotas(double[] notas) {
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida: " + nota + ". As notas devem estar entre 0 e 10.");
                return;
            }
        }
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            System.out.println("Nenhuma nota cadastrada.");
            return 0;
        }

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        if (media < 0) {
            media = 0;
        }

        System.out.println("Aluno: " + nome);
        System.out.println("Quantidade de notas: " + notas.length);
        System.out.println("Média: " + media);

        return media;
    }

    public void resultado(double media) {
        if (media >= 7) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Resultado: Reprovado");
        }
    }
}