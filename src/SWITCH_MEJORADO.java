
import java.util.Scanner;
public class SWITCH_MEJORADO {


    public static void main(String[] args){

   metodo01();


    }


    public  static String metodo01(){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese un día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo):");
         // Leer el día ingresado por el usuario
        // Usamos nextLine() para leer la línea completa
        String dia =scanner.nextLine();
        String diaRetorno= switch(dia){
            case "Lunes" ->{
                System.out.println("Es lunes, inicio de semana");
                            yield "Lunes";
            }
            case "Martes" ->{
                System.out.println("Es martes, segundo día de la semana");
                            yield "Martes";
            }
            case "Miércoles" ->{
                System.out.println("Es miércoles, mitad de semana");
                            yield "Miércoles";
            }
            case "Jueves" ->{
                System.out.println("Es jueves, casi fin de semana");
                            yield "Jueves";
            }
            case "Viernes" ->{
                System.out.println("Es viernes, fin de semana a la vista");
                            yield "Viernes";
            }
            case "Sábado" ->{
                System.out.println("Es sábado, día de descanso");
                            yield "Sábado";
            }
            case "Domingo" ->{
                System.out.println("Es domingo, último día de la semana");
                            yield "Domingo";
            }
            default ->{System.out.println("Día no válido, por favor ingrese un día de la semana");
                       yield "Día no válido";}
        };

        return diaRetorno;



        }
    }







