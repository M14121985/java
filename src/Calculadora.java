import javax.swing.*;


public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.calcular();
    }
/**
 * CLASE CALCULADORA
 * * Esta clase permite realizar operaciones basicas de suma, resta, multiplicacion y division
 * * @author Tu Nombre MATÍAS GONZALO VÁZQUEZ ZUBIMENDI
 * * @version 1.0
 * * Esta clase utiliza JOptionPane para solicitar al usuario los numeros y la operacion a realizar las operaciones básicas mediante una interfaz gráfica.
 * para realizar las operaciones
 * basicas de suma, resta, multiplicacion y division con éxito tras la recepción de los datos de entrada realiza casteo de los numeros ingresados por el usuario a tipo double.
 * Para evitar errores en la división, se verifica que el segundo número no sea cero antes de realizar la operación de división.
 * * Si el usuario ingresa una operación no válida, se muestra un mensaje de error.
 * * @return El resultado de la operación realizada.
 * * Si la operación es válida, se muestra el resultado en un cuadro de diálogo.
 * * Si la operación es inválida, se muestra un mensaje de error y se retorna 0.
 * * Si se intenta dividir por cero, se muestra un mensaje de error y se retorna 0.
 * EJEMPLO DE USO:
 * Calculadora calculadora = new Calculadora();
 * double resultado = calculadora.calcular();
 * System.out.println("El resultado es: " + resultado);
 *
 * */

    public double calcular(){
        String numero1=JOptionPane.showInputDialog(null, "ingresa el primer numero");
        String numero2 =JOptionPane.showInputDialog(null, "ingresa el segundo numero");
        String operacion=JOptionPane.showInputDialog(null, "ingresa la operacion a realizar:  +,  -,  x o  /");

        //casteamos los numeros
        double numero1Final=Double.parseDouble(numero1);
        double numero2Final=Double.parseDouble(numero2);
        double resultado=0;

        switch (operacion) {
            case "+":
                resultado = numero1Final + numero2Final;
                break;
            case "-":
                resultado = numero1Final - numero2Final;
                break;
            case "x":
                resultado = numero1Final * numero2Final;
                break;
            case "/":
                if (numero2Final != 0) {
                    resultado = numero1Final / numero2Final;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Division por cero no permitida.");
                    return 0; // o lanzar una excepción
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacion no valida");
                return 0; // o lanzar una excepción
        }

        JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
        return resultado;
    }















}
