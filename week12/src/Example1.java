/*

 */
import java.util.Scanner;

public class Example1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Satır Sayısını Giriniz: ");
        int sutun = input.nextInt();
        System.out.print("Sütun Sayısını Giriniz: ");
        int satir = input.nextInt();
        
        int A[][] = new int[satir][sutun];
        int B[][] = new int[satir][sutun];
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("A Dizisinin "+i+". sütun ve "+j+" .satır: ");
                A[i][j] = input.nextInt();
                System.out.print("B Dizisinin "+i+". sütun ve "+j+" .satır: ");
                B[i][j] = input.nextInt();
            }
        }
        
        int toplam[][] = new int[satir][sutun];
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                toplam[i][j] = A[i][j]+B[i][j];
            }
        }
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(toplam[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    
}
