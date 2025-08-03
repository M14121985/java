


public class Factoriales {


    long factor1(int n) {

        long factorial = 1;
        int numeroReferencia = n;
        if (n <= 1) {
            return 1;

        } else {
            //calculo del factorial
            //i0 n5 factorial1*5
            //i1 n4 factorial5*4
            // i2 n3 factorial20*3
            // i3 n2 factorial60*2
            // i4 n1 factorial120*1
            // i5 n0 factorial120*1
            for (int i = 0; i < numeroReferencia; i++) {
                factorial *= n;
                n--;
            }
        }


        return factorial;


    }




    long factor2(int n){
        long factorial=1;

        while(n>=1){
            factorial*=n;
            n--;
        }


        return factorial;


    }



    long recursiva(int n){
        if(n<=1){
            return 1;
        }else{

            return n*recursiva(n-1); // Llamada recursiva
            //5x4x3x2x1


        }


    }














}

























