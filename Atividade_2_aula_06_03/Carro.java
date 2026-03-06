package Atividade_2_aula_06_03;

public class Carro {

    private String marca;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(String marca, int velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0; // começa em 0
    }

    public void acelerar(int valor) {
        if (valor < 0) {
            System.out.println("Valor de aceleração inválido.");
            return;
        }

        velocidadeAtual += valor;

        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void frear(int valor) {
        if (valor > velocidadeAtual) {
            System.out.println("Erro: não é possível frear mais que a velocidade atual.");
            return;
        }

        velocidadeAtual -= valor;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }
}