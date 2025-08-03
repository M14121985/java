package PACKAGE_STRINGS;
import java.util.Scanner;

public class SWITCH_MEJORADO {

    public static void main(String[] args){

    SWITCH_MEJORADO switchMejorado= new SWITCH_MEJORADO();
       var diaSemana= switchMejorado.semana();
        System.out.println(diaSemana);

    }



    public String semana(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese una  dia de la semana del 1 al 7 -->  ");
        String entrada=scanner.nextLine();
        int dia=Integer.parseInt(entrada);
        scanner.close();
        String StrinDia="";
        // Usamos switch mejorado (Java 12+)
        // El switch mejorado permite usar expresiones lambda y es más conciso.
        // En este caso, usamos el operador '->' para asignar valores a la variable
        // StrinDia según el valor de día.
        switch(dia){

           case 1 -> { StrinDia="El dia ingresado es Lunes"; }
           case 2 -> { StrinDia="El dia ingresado es Martes"; }
           case 3 -> { StrinDia="El dia ingresado es Miércoles"; }
           case 4 -> { StrinDia="El dia ingresado es Jueves"; }
           case 5 -> { StrinDia="El dia ingresado es Viernes"; }
           case 6 -> { StrinDia="El dia ingresado es Sabado"; }
           case 7 -> { StrinDia="El dia ingresado es Domingo"; }
           default ->{ StrinDia="El dia ingresado NO ES VÁLIDO"; }


        }
        return StrinDia;
    }






}
