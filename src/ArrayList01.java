
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayList01 {


    public static void main(String[] args){

//punto de entrada main
        ArrayList01 arraysListas=new ArrayList01();


        ArrayList <Integer>miArray= arraysListas.createArrysList();
        arraysListas.contarElmentosArrayList(miArray);
        System.out.println("********************ARRAYLIST DINAMICO******************************");




        //creo un arrayList dinamicamnete.
        ArrayList<Integer> array02= new ArrayList<Integer>();
        arraysListas.createDinamicArrysList(array02,4566);
        arraysListas.createDinamicArrysList(array02, 965);
        arraysListas.createDinamicArrysList(array02, 452);
        arraysListas.createDinamicArrysList(array02, 789);
        arraysListas.createDinamicArrysList(array02, 71223);
        arraysListas.createDinamicArrysList(array02, 7999);
        arraysListas.createDinamicArrysList(array02, 73321);
        arraysListas.createDinamicArrysList(array02, 766);
        arraysListas.createDinamicArrysList(array02, 787);
        arraysListas.createDinamicArrysList(array02, 784);
        arraysListas.contarElmentosArrayList(array02);


    }










    /// /////////////////////////////////MÉTODOS DE L ACLASE///////////////////////////////////////

    public  ArrayList <Integer>createArrysList(){

        ArrayList <Integer> lista01=new ArrayList<>();
        lista01.add(45);
        lista01.add(78);
        lista01.add(321);
        lista01.add(78896);
        return lista01;
    }

    public void contarElmentosArrayList(ArrayList<Integer> lista){
        int count=0;
        for( int elemento : lista){
            System.out.println("=================================================================");
            System.out.println("elemento numero %d ---> valor ---> %d ".formatted(count, elemento));
            count++;
        }
        System.out.println("=================================================================");
        System.out.println("[[TOTAL DE ELEMENTOS DE LA LISTA --->> %d ]]".formatted(count) );
        System.out.println("=================================================================");
    }

// Método para crear un ArrayList dinámicamente
// Recibe un ArrayList existente y un elemento a agregar
// Devuelve el ArrayList actualizado con el nuevo elemento agregado
    public  ArrayList <Integer>createDinamicArrysList(ArrayList<Integer>listaExistente, int element){


        listaExistente.add(element);

        return listaExistente;
    }








    

}


