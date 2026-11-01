package calculadora;

/**
 * Realiza operações matemáticas fundamentais para o FinançApp.
 *
 * @author Aluno(a)
 * @version 1.0
 */
public class Calculadora {
    /**
     * Calcula o resultado da operação indicada.
     *
     * @param a primeiro operando inteiro
     * @param b segundo operando inteiro
     * @param op símbolo da operação: +, -, * ou /
     * @return resultado da operação em double
     * @throws IllegalArgumentException se a operação for nula ou inválida
     * @throws ArithmeticException se houver divisão por zero
     */
    public double calc(int a, int b, String op) {
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida: null");
        }
        if (op.equals("+")) {
            return (double) a + b;
        } else if (op.equals("-")) {
            return (double) a - b;
        } else if (op.equals("*")) {
            return (double) a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("Operação inválida: " + op);
        }
    }
}
