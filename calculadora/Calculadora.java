package calculadora;

public class Calculadora{

    public int r = 0;

    public int calc(int a, int b, String op) {
        //calculadora n

        if (op.equals("+")) {
            r = a + b;
        }else if (op.equals( "-")) {
            r = a - b;
        }else if (op.equals( "*")) {
            r = a * b;
        }else if (op.equals( "/")) {
            if(b != 0) {
            r = a / b;
            }else {
                System.out.println("Não é possivel dividir por zero.");
                r = 0;
            }
        }else {
            System.out.println("Operação invalida ");
            r = 0;
        }

        System.out.println("resultado = " + r);
        return r;   
    }
}