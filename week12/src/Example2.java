/*

 */
import java.util.Scanner;

public class Example2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("A'nın Satır Sayısını Giriniz: ");
        int row1 = input.nextInt();
        System.out.print("A'nın Sütun Sayısını Giriniz: ");
        int col1 = input.nextInt();
        
        int A[][] = new int[row1][col1];
        
        int row2 = col1;
        System.out.print("B'nın Sütun Sayısını Giriniz: ");
        int col2 = input.nextInt();
        
        int B[][] = new int[row2][col2];
        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("A'nın "+i+". satır ve "+j+". sütunu: ");
                A[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("B'nin "+i+". satır ve "+j+". sütunu: ");
                B[i][j] = input.nextInt();
            }
        }
        
        int carpim[][] = new int[row1][col2];
        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    carpim[i][j] += A[i][k] * B[k][j]; 
                }
            }
        }
        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(carpim[i][j]+" ");
            }
        }
    }
    
}
