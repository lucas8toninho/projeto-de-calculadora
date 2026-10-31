package calculadora;

// observação: caso o codigo não rode, escreva "java calculadora.TesteCalculadora" no terminal do VScode para exibir os resultados.


public class TesteCalculadora{

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); 

        //testes rapidos
        System.out.println(calc.calcular(2,3,"+"));  // esperando 5
        System.out.println(calc.calcular(10,4,"-")); // esperando 6
        System.out.println(calc.calcular(3,5,"*"));  // esperando 15
        System.out.println(calc.calcular(8,2,"/"));  // esperando 4

        try {
            System.out.println(calc.calcular(8,0,"/"));  // divisão por zero 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5,5,"x"));  // operação invalida 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}

