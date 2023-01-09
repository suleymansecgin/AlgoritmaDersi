/*
Klavyeden Girilen NxN Tipindeki A Matrisinin Simetrik Olup Olmadığını Kontrol Eden Program. 
 */

import java.util.Scanner;
import java.util.Random;

public class work5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("NxN Tipindeki A Matrisi İçin N Değerini Giriniz: ");
        int N = input.nextInt();
        
        int A[][] = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println(" ");
        }
        boolean simetrikmi = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j]!= A[j][i]) {
                    simetrikmi = false;
                }
            }
        }
        
        if (simetrikmi==true) {
            System.out.println("A Matrisi Simetriktir.");
        }
        else{
            System.out.println("A Matrisi Simetrik Değildir.");
        }
        
    }
    
}
