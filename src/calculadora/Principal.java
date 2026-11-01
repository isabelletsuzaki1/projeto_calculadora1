package calculadora;

import java.util.Scanner;

/**
 * Interface de console para utilizar a calculadora sem encerrar em erros de entrada.
 *
 * @author Isabelle Naomi Tsuzaki
 * @version 1.0
 */
public class Principal {
    /**
     * Lê operações e apresenta resultados ou mensagens de erro.
     *
     * @param args argumentos não utilizados
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("FinançApp - Calculadora (digite 'sair' para terminar)");
            while (true) {
                System.out.print("Primeiro número inteiro: ");
                String textoA = scanner.nextLine().trim();
                if (textoA.equalsIgnoreCase("sair")) break;
                try {
                    int a = Integer.parseInt(textoA);
                    System.out.print("Segundo número inteiro: ");
                    int b = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Operação (+, -, *, /): ");
                    String op = scanner.nextLine().trim();
                    System.out.println("Resultado: " + calculadora.calc(a, b, op));
                } catch (NumberFormatException erro) {
                    System.out.println("Erro: informe números inteiros válidos.");
                } catch (IllegalArgumentException erro) {
                    System.out.println("Erro: " + erro.getMessage());
                } // O laço continua após entradas e operações incorretas.
            }
        }
        System.out.println("Encerrado.");
    }
}
