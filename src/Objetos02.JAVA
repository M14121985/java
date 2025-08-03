public class Objetos02 {


public static void main (String[] args){
Object[]varios01={
    "audi a4",
    "bmw m3",
    "mercedes c200",
    "renault 5",
    "seat leon",
    "skoda octavia",
    "toyota corolla",
    "volkswagen golf",
    "volvo s60",
    "volvo s80",
    true, 
    false,
    56,
    654,
    32.56

};

 for (int i=0; i<varios01.length;i++) {
    System.out.println("Objeto numero %d elemento de valor ---> %s".formatted(i,varios01[i]));
 }

for(Object element:varios01){
    System.out.println("con foreach -->"+element);
}



}














}