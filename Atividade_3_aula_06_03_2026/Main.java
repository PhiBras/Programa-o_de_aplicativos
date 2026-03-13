public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Carlos");

        double[] notas = {8.5, 7.0, 9.0, 6.5};

        aluno1.setNotas(notas);

        double media = aluno1.calcularMedia();

        aluno1.resultado(media);

    }

}
