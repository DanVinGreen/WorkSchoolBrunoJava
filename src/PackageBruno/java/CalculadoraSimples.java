package PackageBruno.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = scanner.next();

        // Usa a estrutura switch para verificar a operação
        switch (operacao) {
            case "+":
                System.out.println("O resultado é: " + (num1 + num2));
                break;
            case "-":
                System.out.println("O resultado é: " + (num1 - num2));
                break;
            case "*":
                System.out.println("O resultado é: " + (num1 * num2));
                break;
            case "/":
                // Verifica a divisão por zero
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    // Faz a conversão para double para um resultado preciso
                    double resultadoDivisao = (double) num1 / num2;
                    System.out.println("O resultado é: " + resultadoDivisao);
                }
                break;
            default:
                // Mensagem de erro para operação inválida
                System.out.println("Erro: Operação inválida.");
                break;


        }
    }
}