public class Recursivos {

public static void main (String[] args){
    Recursivos recursivos=new Recursivos();

    System.out.println(recursivos.recursiva4(20));

}

//métodos de la clase Recursivos

    public  int recursiva(int n) {
        if (n <= 1) {
            return 1;
        } else{
                return n * recursiva(n - 1);
            }
        }

    public int recursiva2(int n) {
        var factorial = 1;

        if (n <= 1) {
            return 1;
        } else {
            while(n>=1){
                factorial*=n;
                n--;
            }

        }

        return factorial;
    }



    public long recursiva3(int n){
        long factorial =1;
        int valorFijoN=n;
        if(n<=1){
            return 1;

        }else{
            for(int i=0; i<valorFijoN; i++){
                factorial*=n;
                n--;
            }

        }


    return factorial;



    }




    public long recursiva4(int n){
        long factorial =1;

        if(n<=1){
            return 1;

        }else{
            for(int i=n; i>0; i--){
                factorial*=i;

            }

        }


        return factorial;



    }






}




