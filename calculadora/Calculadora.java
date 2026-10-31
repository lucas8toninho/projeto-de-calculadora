package calculadora;


/*
*<p><strong>Projeto Calculadora</strong></p>
*
*<p>esta classe fornece operacoes logicas basicas como adicao, subtracao, multiplicacao e divisao.
* alem de um metodo principal que seleciona a operacao desejada com base em um operador escolhido 
* pelo ususario</p>
* <p> este projeto é para demonstrar<p/>
*<ul>
*<li>tecnicas de revisao estatistica (caixa branca)</li>
*<li>tecnicas de revisao (caixa branca) </li>
*<li>aplicacao de refatoracao em codigo java </li>
*<li>documentacao em java doc</li>
*</ul>
*
*<p> apos a refatoracao os metodos dessa classe sao <strong>metodos puros</strong>,
*sem efeitos colarerais, permitindi maior legibilidade e facilitando testes unitarios </p>
*
*@autor Lucas antonio dos santos 
*@version 1.0
*/


public class Calculadora{

    /**
     *  soma dois numeros inteiros 
     * 
     * @param a 
     * @param b
     * @return o resultado da soma de {@coda a} e {@code b}
     * 
     */

    public int somar(int a, int b){
        return a + b;
    } 

 /**
     *  subtracao de dois numeros inteiros 
     * 
     * @param a 
     * @param b
     * @return o resultado da subtracao de {@coda a} e {@code b}
     * 
     */

    public int subtracao(int a, int b){
        return a - b ;
    }


    /**
     *  multiplicacao de dois numeros inteiros 
     * 
     * @param a 
     * @param b
     * @return o resultado da multiplicacao de {@coda a} e {@code b}
     * 
     */

    public int multiplicar(int a, int b){
        return a * b ;
    }

    /**
     *  divisao de dois numeros inteiros 
     * 
     * @param a 
     * @param b
     * @return o resultado da divisao de {@coda a} e {@code b}
     * 
     * logicamente a divisao por zero nao e possivel, oque pode ocasionar em um bug,
     * entao esta possibilidade foi limitada com o uso do if
     */

    public int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("divisao por zero nao é permitida");
        }
        return a / b;
    }

    /**
     * 
     * <executa a operacao matematica conforme o operador solicitado</>
     * 
     * <p>operadores aceitos</p>
     * 
     * <ul>
     * <li>"+": soma</li>
     * <li>"-": subtracao</li>
     * <li>"*": multiplicacao</li>
     * <li>"/": divisao</li>
     * </ul>
     * 
     * <p>qualquer operador invalido resulta em excecao</p>
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador simbolo da operacao desejada
     * @return o resultado da operacao 
     * 
     * @throws IllegalArgumentException  se o operador nao for um simbolo valido 
     */

    public int calcular( int a, int b, String operador){
        return switch (operador) {
            case "+" -> somar(a,b);
            case "-" -> subtracao(a, b);
            case "*" -> multiplicar(a,b);
            case "/" -> divisao(a,b);
            default -> throw new IllegalArgumentException("operador invalido" + operador);
        };
    }


}