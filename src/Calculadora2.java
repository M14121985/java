

public class Calculadora2 {



    // operaciones basicas
    public static int sumar2(int a, int b) {
        return a + b;
    }

    public static int restar2(int a, int b) {
        return a - b;
    }

    public static int multiplicar2(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("NO SE PUEDE MULTIPLICAR POR 0");
            throw new ArithmeticException("NO SE PUEDE MULTIPLICAR POR CERO, DA 0");
        } else {
            return a * b;
        }
    }

    public static int dividir2(int a, int b) {
        // validar que no se divida por 0
        if (b == 0) {
            System.out.println("ERROR NO SE PUEDE DIVIDIR POR 0");
            throw new ArithmeticException("No se puede dividir por 0");
        }
        if (a == 0) {
            System.out.println("EL DIVIDENDO NO PUEDE SER 0");
            throw new ArithmeticException("EL DIVIDENDO NO PUEDE SER 0");
        } else {
            return a / b;
        }
    }























}
