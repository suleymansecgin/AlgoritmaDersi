/*
Klavyeden girilen nxn tipindeki a matrisinden üst üçgen b matrisini oluşturan program
 */
import java.util.Scanner;
import java.util.Random;

public class work2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.print("nxn tipindeki çok boyutlu dizi için n değerini giriniz: ");
        int N = input.nextInt();

        int A[][] = new int[N][N];
        int B[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i > j) {
                    B[i][j] = 0;
                } else {
                    B[i][j] = A[i][j];
                }
            }
        }

        System.out.println("A DİZİSİ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
        }
        
        System.out.println("\nB DİZİSİ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j]+ " ");
            }
        }
    }

}
