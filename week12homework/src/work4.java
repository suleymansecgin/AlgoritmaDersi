/*
Klavyeden Girilen NxN tipindeki A matrisinin her bir sütun elemanları çarpımından N elemanlı B dizisini oluşturan program.
 */

import java.util.Scanner;
import java.util.Random;

public class work4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.print("NxN Tipindeki A Matrisi İçin N Değerini Giriniz: ");
        int N = input.nextInt();

        int A[][] = new int[N][N];
        int B[] = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = r.nextInt(100);
            }
        }

        System.out.println("A DİZİSİNİN ELEMANLARI");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < N; i++) {
            B[i] = 1;
            for (int j = 0; j < N; j++) {
                B[i] *= A[j][i];
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }

}
