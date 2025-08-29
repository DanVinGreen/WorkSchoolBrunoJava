package PackageBruno.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro positivo para a contagem regressiva: ");
            int numero = scanner.nextInt();

            // Verifica se o número é positivo
            if (numero <= 0) {
                System.out.println("O programa foi parado porque o número inserido não é positivo.");
            } else {
                System.out.println("Iniciando contagem regressiva... 🚀");
                // Laço 'for' que decrementa a variável 'i' a cada passo
                for (int i = numero; i > 0; i--) {
                    System.out.println("Faltam " + i + " segundos...");
                }
                System.out.println("Contagem encerrada! 🎉");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
        } finally {
            scanner.close();
        }
    }
}