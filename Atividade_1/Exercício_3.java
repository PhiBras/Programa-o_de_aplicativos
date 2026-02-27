import java.util.Scanner;

public class Exercício_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nDigite o primeiro valor (ou EXIT para sair): ");
            String entrada1 = scanner.nextLine();

            if (entrada1.equalsIgnoreCase("EXIT")) {
                break;
            }

            try {
                double valor1 = Double.parseDouble(entrada1);

                System.out.print("Digite o segundo valor: ");
                double valor2 = Double.parseDouble(scanner.nextLine());

                System.out.print("Digite o operador (+, -, *, /, **): ");
                String operador = scanner.nextLine();

                switch (operador) {

                    case "+":
                        System.out.println("Resultado = " + (valor1 + valor2));
                        break;

                    case "-":
                        System.out.println("Resultado = " + (valor1 - valor2));
                        break;

                    case "*":
                        System.out.println("Resultado = " + (valor1 * valor2));
                        break;

                    case "/":
                        if (valor2 == 0) {
                            System.out.println("Divisão não pode ser feita (denominador zero).");
                        } else {
                            System.out.println("Resultado = " + (valor1 / valor2));
                        }
                        break;

                    case "**":
                        System.out.println("Resultado = " + Math.pow(valor1, valor2));
                        break;

                    default:
                        System.out.println("Impossível realizar a operação.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite apenas valores numéricos.");
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}