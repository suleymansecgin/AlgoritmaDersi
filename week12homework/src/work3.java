/*
Klavyeden girilen NxN tipindeki A matrisinin her bir satır elemanlarını kendi aralarında küçükten büyüğe doğru sıralayan program
 */
import java.util.Scanner;
import java.util.Random;

public class work3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.print("NxN Tipindeki A Matrisi İçin N değerini giriniz: ");
        int N = input.nextInt();

        int A[][] = new int[N][N];

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

        int gecici;
        System.out.println("\nHER BİR SATIRIN KÜÇÜKTEN BÜYÜĞE SIRALANMIŞ HALİ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i][k] < A[i][j]) {
                        gecici = A[i][j];
                        A[i][j] = A[i][k];
                        A[i][k] = gecici;
                    }
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
