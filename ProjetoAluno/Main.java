package ProjetoAluno;

public class Main {

    public static void main(String[] args) {

        // Criando um vetor para armazenar 5 alunos
        Aluno[] alunos = new Aluno[5];

        // Cadastrando 5 alunos
        alunos[0] = new Aluno("João", 20, "2023001");
        alunos[1] = new Aluno("Maria", 22, "2023002");
        alunos[2] = new Aluno("Carlos", 19, "2023003");
        alunos[3] = new Aluno("Ana", 21, "2023004");
        alunos[4] = new Aluno("Fernanda", 23, "2023005");

        // Exibindo os alunos cadastrados
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.println("Nome: " + alunos[i].getName());
            System.out.println("Idade: " + alunos[i].getAge());
            System.out.println("Matrícula: " + alunos[i].getRegistration());
            System.out.println("----------------------");
        }
    }
}