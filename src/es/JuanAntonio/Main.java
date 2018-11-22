package es.JuanAntonio;

public class Main {

    public static void main(String[] args) {

        double[] arrayDecimal = {1.6,7.8,1.1,2.8,6.9,4.2};
        int[] arrayEntero = {5,65,28,17,96,35,24,11};
        Math3 array1 = new Math3();


        System.out.println(array1.max(arrayDecimal));
        System.out.println(array1.min(arrayDecimal));

        System.out.println(array1.min(arrayEntero));
        System.out.println(array1.max(arrayEntero));

    }
}
