/*
İki boyutlu dizilerin toplamını bir dizi olarak döndüren metot
 */
import java.util.Scanner;
import java.util.Random;

public class work5 {

    public static int[][] array_sum(int[][] array1, int[][] array2, int N) {

        int[][] array = new int[N][N];
        for (int i = 0; i < array1.length; i++) {
            int toplam = 0;
            for (int j = 0; j < array1.length; j++) {
                toplam = array1[i][j] + array2[i][j];
                array[i][j] = toplam;
            }
        }

        System.out.println("DİZİ ELEMANLARININ TOPLAMI");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        return array;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Dizilerin Satır ve Sütun Sayısını Giriniz: ");
        int A = input.nextInt();
        
        int array1[][] = new int[A][A];
        int array2[][] = new int[A][A];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                array1[i][j] = r.nextInt(10);
                array2[i][j] = r.nextInt(10);
            }
        }

        System.out.println("1.DİZİNİN ELEMANLARI");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("2.DİZİNİN ELEMANLARI");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println("");
        }
        
        array_sum(array1, array2, A);
        
    }

}
