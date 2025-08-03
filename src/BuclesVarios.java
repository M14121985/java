import java.util.Scanner;

public class BuclesVarios {





    public void acceso(){

        try{
        //instancio scanner para leer datos por teclado
        Scanner scanner=new Scanner(System.in);
        //declaro la variable número que voy a usar para el bucle

        int numero;
        boolean access=false;
        int intentos=0;

        while(!access){
            System.out.println("Ingrese el número 5 para salir de la aplicación:");
            numero=scanner.nextInt();
            if(numero ==5){
                access=true;
                System.out.println("Acceso concedido, ha salido de la aplicación.");
            }else{
                System.out.println("Acceso denegado, intente nuevamente.");
                intentos++;
            }

        }
        System.out.println(String.format("Se ha salido del bucle intentos fallidos %d. ",intentos));
        }catch(Throwable e){
            System.out.println("Error al ingresar un número entero."+ e.getMessage());
        }   

    }


    public static void multiplicar(int n){

        while(n<=10){
            System.out.println("Tabla de multiplicar del " + n);
            int j=0;
            while(j<=10){
                System.out.println(String.format("%d x %d = %d", n, j, n * j));
                j++;
            }
            n++;
            System.out.println("===========================================");

        }


    }







}
