import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int N;
        do {
            System.out.print("Dizinin eleman sayısını giriniz: ");
            N = input.nextInt();
        } while (N<=0);
        
        
        System.out.println("Dizi Elemanlarını Klavyeden Giriniz...");
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.println("Dizi Elemanları...");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int X = 0, Y = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i]>0) {
                X++;
                System.out.println("B"+"("+X+")"+" = "+ arr[i]);
            }if(arr[i]<0){
                Y++;
                System.out.println("C"+"("+Y+")"+" = "+ arr[i]);
            }
        }
    }    
}
