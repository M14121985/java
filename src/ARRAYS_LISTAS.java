import java.util.ArrayList;
import java.util.Arrays;

public class ARRAYS_LISTAS {


    public static void main(String[] args){
    ARRAYS_LISTAS arrayListas=new ARRAYS_LISTAS();

    ArrayList<Integer>nums=new ArrayList<Integer>();
    nums.add(1);
    nums.add(32);
    nums.add(555);
    nums.add(14567);
    nums.add(789);

    int[] numerosArray={1,2,3,4,5,6,7,8,9,70,74,789,754,7899,654,123,456,789,321,654,};
    arrayListas.recorrerArrayNumeros(numerosArray);
    /*    //recorrer array
    public void recorrerArrayNumeros(int [] numeros){
        for(int i=0; i<numeros.length;i++){
            //.formatted , o String.format
            //para formatear cadenas de texto
            System.out.println("El numero en la posicion %d es ---> %d".formatted(i, numeros[i]));
        }

    }*/
    System.out.println("**************************************************");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //recorrer array para copiarlo en otro array
    System.out.println("Recorriendo el array y copiando en otro array");
    arrayListas.recorrerArrayAndCopyInOther(numerosArray);

    /*    //recorrer array y copiarlo a otro array

    public void recorrerArrayAndCopyInOther(int[] nums) {
        //creamos el nuevo array con la misma longitud que el original
        int[] numsToCopy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsToCopy[i] = nums[i];
        }
        System.out.println(Arrays.toString(numsToCopy));
    }
*/
    System.out.println("**************************************************");

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }



    //recorrer array
    public void recorrerArrayNumeros(int [] numeros){
        for(int i=0; i<numeros.length;i++){
            //.formatted , o String.format
            //para formatear cadenas de texto
            System.out.println("El numero en la posicion %d es ---> %d".formatted(i, numeros[i]));
        }


    }

    //recorrer array y copiarlo a otro array

    public void recorrerArrayAndCopyInOther(int[] nums) {
        //creamos el nuevo array con la misma longitud que el original
        int[] numsToCopy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsToCopy[i] = nums[i];
        }
        System.out.println(Arrays.toString(numsToCopy));
    }



}
