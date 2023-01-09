/*
 */
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin Satır ve Sütun Sayısını Giriniz: ");
        int N = input.nextInt();
        int A[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = input.nextInt();
            }
        }
        
        
        int max = A[0][0];
        int min = A[0][0];
        int maxrow = 0;
        int minrow = 0;
        int maxcol = 0;
        int mincol = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    maxrow = i;
                    maxcol = j;
                }
                if (A[i][j] < min) {
                    min = A[i][j];
                    minrow = i;
                    mincol = j;
                }
            }
        }
        
        
        System.out.println("En Büyük Değer: "+max);
        System.out.println("En Küçük Değer: "+min);
        System.out.println("En Küçük Değerin Bulunduğu Satır: "+minrow);
        System.out.println("En Büyük Değerin Bulunduğu Satır: "+maxrow);
        System.out.println("En Küçük Değerin Bulunduğu Sütün: "+mincol);
        System.out.println("En Büyük Değerin Bulunduğu Sütun: "+maxcol);
        
        
    }

}
