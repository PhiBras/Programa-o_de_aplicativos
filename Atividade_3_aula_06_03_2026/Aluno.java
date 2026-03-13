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

        this.notas = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] >= 0 && notas[i] <= 10) {
                this.notas[i] = notas[i];
            } else {
                System.out.println("Nota inválida: " + notas[i]);
                this.notas[i] = 0;
            }

        }
    }

    public double[] getNotas() {
        return notas;
    }

    public double calcularMedia() {

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

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
