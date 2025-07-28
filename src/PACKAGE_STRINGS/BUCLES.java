package PACKAGE_STRINGS;

public class BUCLES {
    public static void main(String[] args){
        BUCLES bucles=new BUCLES();
        bucles.bucleWhile();
        bucles.buclesFor();
        bucles.buclesForEach();
    }





public void bucleWhile(){
    int i=0;
    while(i<=10){
        int j=0;
        System.out.println("Tabla de multiplicar del "+i);
        while(j<=10){
            System.out.println(String.format(" %d x %d = %d ",i,j, i*j));
            j++;
        }
        i++;
        System.out.println("==========================\n");
    }
}


public void buclesFor(){
    // Bucle for anidado para imprimir tablas de multiplicar del 0 al 10
    System.out.println("Tablas de multiplicar del 0 al 10 CON BUCLE FOR ANIDADO");
        for(int i=0; i<=10;i++){
            System.out.println("Tabla de multiplicar del "+i);
            for(int j=0; j<=10; j++){
                System.out.println(String.format(" %d x %d = %d ",i,j, i*j));
            }
            System.out.println("==========================\n");

        }



    }

public void buclesForEach(){
        //tabla de multiplicar con bucle for each
        System.out.println("Tablas de multiplicar del 0 al 10 CON BUCLE FOR EACH");
        int [] multiplicando= {0,1,2,3,4,5,6,7,8,9,10};
        int[] multiplicador = {0,1,2,3,4,5,6,7,8,9,10};

        for(int elemento : multiplicando){
            System.out.println("Tabla de multiplicar del "+elemento);
            for(int n : multiplicador){
                System.out.println(String.format(" %d x %d = %d ",elemento,n, elemento*n));

            }
            System.out.println("==========================\n");

        }

}





}