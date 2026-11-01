package calculadora;

/**
 * Executa operações aritméticas utilizadas nas funcionalidades do FinançApp.
 * A validação separa o tratamento de erros da lógica matemática.
 *
 * @author Aluno(a)
 * @version 2.0
 */
public class Calculadora {
    /**
     * Realiza uma operação com dois números inteiros.
     *
     * @param a primeiro operando inteiro
     * @param b segundo operando inteiro
     * @param op operador matemático: +, -, * ou /
     * @return resultado da operação como double, inclusive divisões decimais
     * @throws IllegalArgumentException quando o operador é nulo ou não suportado
     * @throws ArithmeticException quando se tenta dividir por zero
     */
    public double calc(int a, int b, String op) {
        validarOperador(op);
        // Converte os operandos para double antes de calcular, evitando overflow inteiro.
        return switch (op) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operação inválida: " + op);
        };
    }

    /**
     * Verifica a presença do operador.
     *
     * @param operador símbolo a verificar
     * @throws IllegalArgumentException se o símbolo for nulo
     */
    private void validarOperador(String operador) {
        if (operador == null) {
            throw new IllegalArgumentException("Operação inválida: null");
        }
    }

    /**
     * Soma dois valores.
     * @param primeiro primeiro operando
     * @param segundo segundo operando
     * @return soma dos operandos
     */
    private double somar(int primeiro, int segundo) {
        return (double) primeiro + segundo;
    }

    /**
     * Subtrai dois valores.
     * @param primeiro primeiro operando
     * @param segundo segundo operando
     * @return diferença entre os operandos
     */
    private double subtrair(int primeiro, int segundo) {
        return (double) primeiro - segundo;
    }

    /**
     * Multiplica dois valores.
     * @param primeiro primeiro operando
     * @param segundo segundo operando
     * @return produto dos operandos
     */
    private double multiplicar(int primeiro, int segundo) {
        return (double) primeiro * segundo;
    }

    /**
     * Divide dois valores e valida o divisor.
     * @param primeiro dividendo
     * @param segundo divisor
     * @return quociente como número decimal
     * @throws ArithmeticException se o divisor for zero
     */
    private double dividir(int primeiro, int segundo) {
        if (segundo == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double) primeiro / segundo;
    }
}
