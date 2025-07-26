import javax.swing.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
//
//        String nombre=JOptionPane.showInputDialog(null, "ingresa tu nombre..");
//        String apellido= JOptionPane.showInputDialog(null, "ingresa tu apellido");
//        String edad=JOptionPane.showInputDialog(null, "ingresa tu edad");
//        //casteo edad
//        int edadaInt=Integer.parseInt(edad);
//        JOptionPane.showMessageDialog(null, "Hola "+nombre+" "+apellido+" tu edad es "+edadaInt);



        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero para calcular el factorial:..");
        int numero = scanner.nextInt();

        // calculo del factorial

        long factorial = 1;
        for (int i = numero; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println(String.format("el factorial del numero %d es --> %d ", numero, factorial));
        scanner.close();




        //instancio metodo de la clase Factoriales
        Factoriales factoriales= new Factoriales();
        long resultado1= factoriales.factor1(10);
        System.out.println("El resultado del factorial es: " + resultado1);


        Factoriales factorial2=new Factoriales();
        long resultado2=factorial2.factor2(20);
        System.out.println(String.format("El resultado del factorial es --> %d " , resultado2));


        Factoriales factorial3=new Factoriales();
        long resultado3=factorial3.recursiva(20);
        System.out.println(String.format("El resultado del factorial recursivo es --> %d ", resultado3));





        //instancio metodo de la clase Calculadora
        Calculadora calculadora=new Calculadora();
        double primerResultado=calculadora.calcular();




        // Ejemplo de uso de la clase Operaciones
        Operaciones operaciones = new Operaciones();
        System.out.println("Número 1 (aleatorio): " + operaciones.num1);
        System.out.println("Número 1 (ceil): " + operaciones.num1Ceil);
        // Mostrar los resultados de las operaciones matemáticas
        System.out.println("******************Resultados de operaciones matemáticas******************");
        System.out.println("Número 2 (2^10): " + operaciones.num2);
        System.out.println("Número 3 (raíz cuadrada de 100): " + operaciones.num3);
        System.out.println("Número 4 (raíz cúbica de 9): " + operaciones.num4);
        System.out.println("Número 5 (ceil de 10.2): " + operaciones.num5);
        System.out.println("Número 6 (floor de 10.8): " + operaciones.num6);
        System.out.println("Número 7 (abs de -10.5): " + operaciones.num7);
        System.out.println("Número 8 (max entre 10 y 20): " + operaciones.num8);
        System.out.println("Número 9 (min entre 10 y 20): " + operaciones.num9);
        System.out.println("Número 10 (round de 10.5): " + operaciones.num10);


        System.out.println("******************operaciones con BigInteger******************");
        System.out.println("Número 11 (BigInteger de 4555555555): " + operaciones.num11);
        System.out.println("Número 12 (BigInteger de 444444444444444444444444444444444444444444): " + operaciones.num12);
        System.out.println("******************Resultados de operaciones con BigInteger******************");
        System.out.println("Suma de BigInteger: " + operaciones.sumaBig);
        System.out.println("Resta de BigInteger: " + operaciones.restaBig);
        System.out.println("Multiplicación de BigInteger: " + operaciones.multiBig);
        System.out.println("División de BigInteger: " + operaciones.divBig);









    }
}