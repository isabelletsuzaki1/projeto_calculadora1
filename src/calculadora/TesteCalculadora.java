package calculadora;

/**
 * Suíte de testes unitários sem bibliotecas externas.
 * Cada caso informa entrada, resultado esperado e resultado obtido.
 *
 * @author Isabelle Naomi Tsuzaki
 * @version 1.0
 */
public class TesteCalculadora {
    /** Quantidade de casos aprovados. */
    private static int aprovados = 0;
    /** Quantidade de casos reprovados. */
    private static int reprovados = 0;

    /**
     * Executa todos os casos de teste e sinaliza falhas ao processo.
     *
     * @param args argumentos não utilizados
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        testarResultado("Soma", calculadora, 5, 3, "+", 8.0);
        testarResultado("Subtração", calculadora, 5, 3, "-", 2.0);
        testarResultado("Multiplicação", calculadora, 5, 3, "*", 15.0);
        testarResultado("Divisão", calculadora, 7, 2, "/", 3.5);
        testarExcecao("Divisão por zero", calculadora, 8, 0, "/", ArithmeticException.class);
        testarExcecao("Operação inválida", calculadora, 5, 3, "%", IllegalArgumentException.class);
        testarExcecao("Operação nula", calculadora, 5, 3, null, IllegalArgumentException.class);
        testarResultado("Números negativos", calculadora, -5, 2, "+", -3.0);
        testarResultado("Valores grandes", calculadora, Integer.MAX_VALUE, 1, "+", 2147483648.0);
        System.out.printf("%nResumo: %d aprovado(s), %d reprovado(s).%n", aprovados, reprovados);
        if (reprovados > 0) {
            throw new AssertionError("Existem testes reprovados.");
        }
    }

    /**
     * Confere o retorno numérico de uma operação.
     *
     * @param nome descrição do caso
     * @param calculadora objeto testado
     * @param a primeiro operando
     * @param b segundo operando
     * @param op operador
     * @param esperado resultado esperado
     */
    private static void testarResultado(String nome, Calculadora calculadora,
                                        int a, int b, String op, double esperado) {
        try {
            double obtido = calculadora.calc(a, b, op);
            registrar(nome, a, b, op, Double.toString(esperado),
                     Double.toString(obtido), Double.compare(esperado, obtido) == 0);
        } catch (Exception erro) {
            registrar(nome, a, b, op, Double.toString(esperado),
                     erro.getClass().getSimpleName(), false);
        }
    }

    /**
     * Confere se uma entrada inválida produz a exceção correta.
     *
     * @param nome descrição do caso
     * @param calculadora objeto testado
     * @param a primeiro operando
     * @param b segundo operando
     * @param op operador
     * @param esperada classe da exceção esperada
     */
    private static void testarExcecao(String nome, Calculadora calculadora, int a,
                                     int b, String op, Class<? extends Exception> esperada) {
        try {
            double obtido = calculadora.calc(a, b, op);
            registrar(nome, a, b, op, esperada.getSimpleName(), Double.toString(obtido), false);
        } catch (Exception erro) {
            registrar(nome, a, b, op, esperada.getSimpleName(),
                     erro.getClass().getSimpleName(), esperada.isInstance(erro));
        }
    }

    /**
     * Exibe a comparação e atualiza a contagem dos testes.
     *
     * @param nome descrição do teste
     * @param a primeiro operando
     * @param b segundo operando
     * @param op operador
     * @param esperado resultado ou exceção esperada
     * @param obtido resultado ou exceção obtida
     * @param passou indica aprovação
     */
    private static void registrar(String nome, int a, int b, String op,
                                 String esperado, String obtido, boolean passou) {
        System.out.printf("[%s] %s | entrada=(%d, %d, %s) | esperado=%s | obtido=%s%n",
                          passou ? "OK" : "FALHOU", nome, a, b, op, esperado, obtido);
        if (passou) {
            aprovados++;
        } else {
            reprovados++;
        }
    }
}
