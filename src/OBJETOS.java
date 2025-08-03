import java.util.List;
import java.util.Arrays;

public class OBJETOS {

    public static void main(String[] args){
//creamos objeto de 3 posiciones
Object[] arrayObjetos=new Object[3];
//creamos objetos sueltos
Object elemento1="Pera";
Object elemento2="Manzana";
Object elemento3="Melon Gordo";
//llamamos al método rellenadorObjetos para rellenar el array de objetos
rellenadorObjetos(arrayObjetos,0, elemento1);
rellenadorObjetos(arrayObjetos,1, elemento2);
rellenadorObjetos(arrayObjetos,2, elemento3);
System.out.println(Arrays.toString(arrayObjetos));


List<Object> listaDeObjetos=List.of("manzana", "pera", "melon", "sandia", "kiwi",45,789,6555, 12.5, 3.14, true, false);
System.out.println(listaDeObjetos);


for(int i=0; i<listaDeObjetos.size();i++){
    System.out.println("elemento posicion %d --> elemento %s".formatted(i, listaDeObjetos.get(i)));
}

System.out.println("********************************************************************************");
for(int i=0; i<listaDeObjetos.size();i++){
    System.out.println("ELEMENTO POSICION %d --> VALOR %s".formatted(i, listaDeObjetos.get(i)));
}

    }





    public static Object[] rellenadorObjetos(Object[] ObjetoCreado,  int index, Object elemento) {
        if (ObjetoCreado == null|| index< 0 || index >=ObjetoCreado.length) {
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }
            ObjetoCreado[index] = elemento;

        return ObjetoCreado;
    }















}
