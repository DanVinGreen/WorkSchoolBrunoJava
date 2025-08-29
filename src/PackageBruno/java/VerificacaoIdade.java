package PackageBruno.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Laço de repetição infinito que só para com o comando 'break'
        while (true) {
            System.out.print("Por favor, digite sua idade: ");

            try {
                int idade = scanner.nextInt();

                // Verifica se a idade é um número positivo
                if (idade > 0) {
                    if (idade >= 18) {
                        System.out.println("Acesso permitido. ✅");
                    } else {
                        System.out.println("Acesso negado. ⛔");
                    }
                    // Quebra o laço, pois uma idade válida foi fornecida
                    break;
                } else {
                    System.out.println("Erro: A idade deve ser um número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                // Limpa o buffer do scanner para evitar um loop infinito de erro
                scanner.next();
            }
        }

        scanner.close();
    }
}