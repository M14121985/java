import java.math.*;//importa todas las clases de este paquete
//import java.math.BigInteger;
public class Operaciones {

    double num1=Math.random()*100;
    double num1Ceil=Math.ceil(num1);
    double num2=Math.pow(2,10);
    double num3=Math.sqrt(100);
    double num4=Math.cbrt(9);
    double num5=Math.ceil(10.2);
    double num6=Math.floor(10.8);
    double num7=Math.abs(-10.5);
    double num8=Math.max(10, 20);
    double num9=Math.min(10, 20);
    double num10=Math.round(10.5);



    BigInteger num11=BigInteger.valueOf(4555555555l);
    BigInteger num12= new BigInteger("444444444444444444444444444444444444444");
    BigInteger sumaBig=num11.add(num12);
    BigInteger restaBig=num11.subtract(num12);
    BigInteger multiBig=num11.multiply(num12);
    BigInteger divBig=num11.divide(num12);



}
