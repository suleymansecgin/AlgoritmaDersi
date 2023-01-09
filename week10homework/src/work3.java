import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N;
        do {
            System.out.print("Dizinin Eleman Sayısını Giriniz: ");
            N = input.nextInt();
        } while (N<=0);
        
        int arr[] = new int[N];
        
        System.out.println("Dizi elemanlarını klavyeden giriniz...");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("x = b için b değerini giriniz: ");
        int b = input.nextInt();
        
        int t = arr[0];
        
        for (int i = 1; i < N; i++) {
            double x = Math.pow(b, i-1);
            t = t+arr[i]*b;
        }
        System.out.println(t);
    }    
}
