package Sistema_de_gestão_de_pessoas_e_pagamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Pessoa> pessoas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static boolean cpfExiste(String cpf) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        if (cpfExiste(cpf)) {
            System.out.println("CPF já cadastrado!");
            return;
        }

        System.out.print("Limite de Crédito: ");
        double limite = sc.nextDouble();

        pessoas.add(new Cliente(nome, cpf, limite));

        System.out.println("\nCliente cadastrado com sucesso!!!");
    }

    public static void cadastrarGerente() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        if (cpfExiste(cpf)) {
            System.out.println("CPF já cadastrado!");
            return;
        }

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        pessoas.add(new Gerente(nome, cpf, salario));

        System.out.println("\nGerente cadastrado com sucesso!!!");

    }

    public static void cadastrarVendedor() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        if (cpfExiste(cpf)) {
            System.out.println("CPF já cadastrado!");
            return;
        }

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.print("Total de Vendas: ");
        double vendas = sc.nextDouble();

        pessoas.add(new Vendedor(nome, cpf, salario, vendas));

        System.out.println("\nVendedor cadastrado com sucesso!!!");

    }

    public static void listarPessoas() {
        for (Pessoa p : pessoas) {
            System.out.println("\n---------------------------");

            if (p instanceof Gerente){
                System.out.println("          GERENTE");
            }else if (p instanceof Vendedor) {
                System.out.println("          VENDEDOR");
            }else if (p instanceof Cliente) {
                System.out.println("          CLIENTE");
            }

            p.exibirDados();
        }
    }

    public static void calcularPagamentos() {
        for (Pessoa p : pessoas) {
            if (p instanceof Pagavel) {
                Pagavel pagavel = (Pagavel) p;

                System.out.print("\nNome: " + p.getNome());
                System.out.print("Pagamento: " + pagavel.calcularPagamento());
            }
        }
    }

    public static void removerPessoa() {
        System.out.println("Digite o CPF da pessoa que deseja remover:");
        String cpf = sc.nextLine();

        Pessoa pessoaRemover = null;

        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                pessoaRemover = p;
                break;
            }
        }

        if (pessoaRemover != null) {
            pessoas.remove(pessoaRemover);
            System.out.println("Pessoa removida com sucesso!");
        } else {
            System.out.println("CPF não encontrado!");
        }
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Gerente");
            System.out.println("3 - Cadastrar Vendedor");
            System.out.println("4 - Listar Pessoas");
            System.out.println("5 - Calcular Pagamentos");
            System.out.println("6 - Remover Pessoa");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarGerente();
                    break;
                case 3:
                    cadastrarVendedor();
                    break;
                case 4:
                    listarPessoas();
                    break;
                case 5:
                    calcularPagamentos();
                    break;
                case 6:
                    removerPessoa();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}