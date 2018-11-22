package es.JuanAntonio;

public class Math3 implements Extremos{



    @Override
    public double max(double[] a) {

        double decimalMax = a[0];
        for (int i = 1 ; i < a.length ; i++) {

            if (a[i] > decimalMax) {
                decimalMax = a[i];
            }
        }

        return decimalMax;
    }

    @Override
    public double min(double[] a) {

        double decimalMin = a[0];
        for (int i = 1 ; i < a.length ; i++) {
            if (a[i] < decimalMin) {
                decimalMin = a[i];
            }
        }
        return decimalMin;
    }

    @Override
    public int max(int[] a) {

        int enteroMax = a[0];
        for (int i = 1 ; i < a.length ; i++) {

            if (a[i] > enteroMax) {
                enteroMax = a[i];
            }
        }
        return enteroMax;
    }

    @Override
    public int min(int[] a) {

        int enteroMin = a[0];
        for (int i = 1 ; i < a.length ; i++) {

            if (a[i] < enteroMin) {
                enteroMin = a[i];
            }
        }
        return enteroMin;
    }
}
