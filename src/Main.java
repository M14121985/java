import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio = random.nextInt();
        int numero2 = random.nextInt();
        int numero3 = random.nextInt(100);
        int numero4 = random.nextInt(1000);
        int numero5 = random.nextInt(10);

        System.out.println("El numero aleatorio es: " + numero2);
        System.out.println("El numero aleatorio es: " + numero3);
        System.out.println("El numero aleatorio es: " + numero4);
        System.out.println("El numero aleatorio es: " + numero5);
        System.out.println("El numero aleatorio es: " + numeroAleatorio);

        Calculadora calculadora = new Calculadora();
        // ya instanciamos la clase ahora llamamos los métodos
        int sumar = calculadora.sumar(10, 25);
        int restar = calculadora.restar(50, 100);
        int dividir = calculadora.dividir(20, 5);
        int multiplicar = calculadora.multiplicar(6, 3);
        System.out.println("La suma es: " + sumar);
        System.out.println("La resta es: " + restar);
        System.out.println("La división es: " + dividir);
        System.out.println("La multiplicación es: " + multiplicar);



        //lamadas  de la clase Calculadora2 metodos staticos

        int suma2=Calculadora2.sumar2(10, 20);
        int resta2=Calculadora2.restar2(50, 20);
        int multiplicar2=Calculadora2.multiplicar2(5,60);
        int dividir2=Calculadora2.dividir2(100, 5);

        System.out.println("La suma es---> " + suma2);
        System.out.println("La resta es ---> " + resta2);
        System.out.println("La multiplicación es ---> " + multiplicar2);
        System.out.println("La división es ---> " + dividir2);




        // Llamada al método no se necesita instanciar la clase por que es estatico
        metodo2();

        // Llamada al método saludar debo de instanciarlo por que no estatico//

        Main instancia =new Main();
        String saludo =instancia.saludar();
        System.out.println(saludo);








        System.out.println("******************************* RECURSIVA CON FUNCION RECURSIVA ************************************************");

        //llamada funcion de la clase Recursivos

        //instanciamos ya que no esta estatica

        Recursivos recursiva=new Recursivos();
        int resultado1=recursiva.recursiva(5);
        int reusltado2=recursiva.recursiva(10);
        int resultado3=recursiva.recursiva(15);
        System.out.println(String.format("el resultado de la recursiva 5 es --> %d,\n" +
                "el resultado de recursiva de 10 es --> %d,\n" +
                "el resultado de recursiva de 15 es --> %d " , resultado1, reusltado2, resultado3));


        System.out.println("******************************* RECURSIVA CON WHILE ************************************************");

        int resultadoFactorial2=recursiva.recursiva2(5);
        int resultadoFactorial3=recursiva.recursiva2(10);
        int resultadoFactorial4=recursiva.recursiva2(15);
        System.out.println(String.format("el resultado de la recursiva 2 de 5 es --> %d,\n" +
                "el resultado de recursiva 2 de 10 es --> %d,\n" +
                "el resultado de recursiva 2 de 15 es --> %d " , resultadoFactorial2, resultadoFactorial3, resultadoFactorial4));



    System.out.println("=============================================== BUCLAS VARIOS ================================");

        //llamada a la clase BuclesVarios
        //instanciamos la clase para poder llamar al metodo acceso

        //instancio la clase
        //llamo al metodo acceso que es el que tiene el bucle
    BuclesVarios buclesVarios=new BuclesVarios();
        buclesVarios.acceso();


System.out.println("=============================================== FIN DE LA APLICACION ================================");

        //llamada al metodo estatico de la clase BuclesVarios
        //no es necesario instanciar la clase por que es estatico
        //llamamos al metodo multiplicar que tiene un bucle
        //multiplica del 1 al 10 el numero que le pasemos por parametro
        //en este caso le pasamos el 5
        System.out.println("=============================================== TABLA DE MULTIPLICAR ================================");
BuclesVarios.multiplicar(5);


    }

    // Otro Método de la clase Main que no es estatico ojo habra que instanciar la clase para poder llamarlo
    public String  saludar() {
        return "Hola, mundo!";
    }



    public static void metodo2() {
        var edad = 100;

        if (edad >= 1 && edad <= 5) {
            System.out.println("eres un bebé");
        } else if (edad >= 6 && edad <= 12) {
            System.out.println("eres un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("eres un adolescente");
        } else if (edad >= 18 && edad <= 25) {
            System.out.println("eres un joven");
        } else if (edad >= 26 && edad <= 59) {
            System.out.println("eres un adulto");
        } else if (edad >= 60 && edad <= 104) {
            System.out.println("eres un adulto mayor");
        } else if (edad >= 105 || edad <= 0) {
            System.out.println("edad no válida".toUpperCase());
        }
    }


}