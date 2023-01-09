/*

 */
import java.util.Scanner;

public class Example3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("A Dizisinin Satır ve Sütun Sayısını Giriniz: ");
        int N = input.nextInt();

        
        int A[][] = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = input.nextInt();
            }
        }
        
        int toplam = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j>i) {
                    toplam += A[i][j];
                }
            }
        }
        System.out.println(toplam);
        
    }
    
}
