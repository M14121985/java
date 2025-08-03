package PACKAGE_STRINGS;

import java.sql.SQLOutput;
import javax.swing.*;

public class Strings {

    public static void main(String[] args){

        mostrarDatos();
        mostarDatos2();
        manipularStrings1();
        manipularString2();
        manipularString3();
        }


    // MÉTODOS FUERA DEL MÉTODO MAIN
    // Estos métodos se pueden llamar desde el método main o desde otros métodos de la clase.
    // Se pueden llamar directamente por su nombre, ya que son estéticos.
    // Si no fueran estáticos, se tendría que instanciar la clase para

    public static void mostrarDatos() {
        String nombreInput = JOptionPane.showInputDialog("INGRESA TU NOMBRE: ");
        String apellidoInput = JOptionPane.showInputDialog("INGRESA TU APELLIDO: ");
        int edadInput= Integer.parseInt(JOptionPane.showInputDialog("INGRESA TU EDAD: "));
        JOptionPane.showMessageDialog(null, "Hola "+nombreInput+" "+apellidoInput+" tu edad es "+edadInput);

        if(edadInput<12){
            System.out.println("Eres un niño");
        }else if(edadInput >=12 && edadInput<=17){
            System.out.println("Eres un adolescente");
        }else if(edadInput >17 && edadInput<=25){
            System.out.println("Eres un Joven");
        }else if(edadInput>25 && edadInput <=60){
            System.out.println("Eres un adulto");
        }else if(edadInput >60 && edadInput <=100){
            System.out.println("Eres un adulto mayor");
        }else{
            System.out.println("Edad no valida");
        }


    }

    public static void mostarDatos2(){
        String nombre="matias gonzalo vazquez zubimendi";
        System.out.println(nombre.charAt(nombre.length()-1));
        System.out.println(nombre.substring(0,5));
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.equals("MATIAS GONZALO VAZQUEZ ZUBIMENDI"));
        System.out.println(nombre.equalsIgnoreCase("MATIAS GONZALO VAZQUEZ ZUBIMENDI"));
        System.out.println(nombre.split(" "));
        //CASTEO DE STRING A ARRAY DE STRING
        String[] nombreArray=nombre.split(" " );
        for(var n:nombreArray) {
            System.out.println(n);
        }
        for(int i=0; i<=nombreArray.length-1; i++) {
            System.out.println("BUCLE CON FOR TRADICIONAL --> "+nombreArray[i]);

        }

    }

    public static void  manipularStrings1(){

        String nombre ="Zubimendi";
        String apellido="Zubimendi";
        //comparación de cadenas .compareTo devuelve 0 si ambas cadenas son iguales por eso se compara con 0
        //si devuelve un valor negativo significa que la cadena nombre es menor que la cadena apellido
        //si devuelve un valor positivo significa que la cadena nombre es mayor que la cadena apellido
        //si son iguales devuelve 0
        if(nombre.compareTo(apellido)==0){
            System.out.println ("SON IGUALES TIENE LAS MISMAS LETRAS Y ORDEN");
            } else{
            System.out.println("NO SON IGUALES TIENEN DISTINTAS LETRAS O ORDEN");
        }
    }

    public static void manipularString2(){
        String nombre="matías gonzalo vázquez zubimendi";
        String busca="matías";
        if(nombre.contains(busca)){
            System.out.println(String.format("El nombre contiene la palabra buscada --> %s ",busca));

        }else{
            System.out.println("El nombre NO contiene la palabra buscada -->"+ busca);
        }
        //recorrer con for
        String[]array= nombre.split(" ");
        for(var i=0; i<array.length; i++){
            System.out.println(String.format("elemento del array número %d valor --> %s",i,array[i]));
        }
        //con foreach
        for(String elemento : array){
            System.out.println("elemento del array con foreach --> "+ elemento);

        }


    }



    public static void manipularString3(){
        String nombre="matías";
        String testigo="matías";
        //equals compara el contenido de las cadenas
        if(nombre.equalsIgnoreCase(testigo)){
            System.out.println("Las cadenas son iguales (ignora mayúsculas y minúsculas)");

        }else{
            System.out.println("Las cadenas NO son iguales aun sín importar las mayúsculas y minúsculas");
        }

    }













}

