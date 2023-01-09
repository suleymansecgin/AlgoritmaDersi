/*
Klavyeden Girilen NxN Tipindeki A Matrisinden Alt Üçgen B Matrisini Oluşturan Program.
 */

import java.util.Scanner;
import java.util.Random;

public class work6 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("NxN Tipindeki A Matrisi İçin N Değerini Giriniz: ");
        int N = input.nextInt();
        
        int [][] array1 = new int[N][N];
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = r.nextInt(10);
            }
        }
        
        int [][] array2 = new int [N][N];
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (i>j) {
                    array2[i][j] = array1[i][j];
                }else{
                    array2[i][j] = 0;
                }
            }
        }
        
        System.out.println("DİZİ 1 ELEMANLARI");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("DİZİ 2 ELEMANLARI");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println("");
        }        
    }
    
}
