import java.util.Scanner;
import java.util.Random;

public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int N;
        do {
            System.out.print("Bir Sayı Giriniz: ");
            N = input.nextInt();
        } while (N<0);
        
        int arr1[] = new int[N];
        int arr2[] = new int[N];
        
        //diziye elemanları ekleme.
            for (int i = 0; i < N; i++) {
            arr1[i] = r.nextInt(10);// 1-10 arası sayılar eklendi.
        }
        for (int i = 0; i < N; i++) {
            arr2[i] = r.nextInt(10);// 1-10 arası sayılar eklendi.
        }
        //dizi elemanlarını konsola yazdırma.
        System.out.println("1.Dizinin Elemanları");
        for (int i = 0; i < N; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n2.Dizinin Elemanları");
        for (int i = 0; i < N; i++) {
            System.out.print(arr2[i]+" ");
        }
        //dizi elemanlarının çarpımı.
        int s = 0;
        for (int i = 0; i < N; i++) {
            s = s + arr1[i]*arr2[i];
        }
        //çarpım değerini ekrana yazdırma.
        System.out.println("");
        System.out.println(s);
    }   
}
