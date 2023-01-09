/*
 */

public class Example2 {

    public static void array_mean(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = (double) sum / array.length;
        System.out.println("Dizinin Ortalaması: " + mean);

    }

    public static void max_min(int[] array) {

        int min = array[0];
        int minindex = 0;
        int max = array[0];
        int maxindex = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minindex = i;
            }
            if (max < array[i]) {
                max = array[i];
                maxindex = i;
            }
        }

        System.out.println("Dizinin Maximum Elemanı: " + max + " İndisi: " + maxindex);
        System.out.println("Dizinin Minimum Elemanı: " + min + " İndisi: " + minindex);

    }

    public static void main(String[] args) {

        int sayi[] = {10, 7, 5, 12, 18, 32};

        array_mean(sayi);
        max_min(sayi);

    }

}
