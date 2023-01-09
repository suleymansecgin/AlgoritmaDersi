//dizi elemanlarının aritmetik ortalamasını, geometrik ortalamasını, harmonik ortalamasını ve kontraharmonik ortalamasını bulma
import java.util.Scanner;
import java.util.Random;

public class work2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int N;
        do {
            System.out.print("Dizinin eleman sayısını giriniz: ");
            N = input.nextInt();
        } while (N<0);
        
        //diziyi tanımlama
        int arr[] = new int[N];
        
        //diziye eleman ekleme
        for (int i = 0; i < N; i++) {
            arr[i] = r.nextInt(100);
        }
        
        System.out.println("Dizi Elemanları");
        //dizi elemanlarını yazdırma
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
        
        //aritmetik ortalamayı hesaplama
        int T = 0, C = 1,HT = 0, KT = 0;

        for (int i = 0; i < N; i++) {
            T += arr[i];
            C *= arr[i];
            HT = HT + 1/arr[i];
            KT = (int) (KT + Math.pow(arr[i], 2));
        }
        double ao = T/N;
        double go = Math.pow(C, (1/N));
        double ho = N/HT;
        double kho = KT/T;
        System.out.print("Dizi Elemanlarının Aritmetik Ortalaması: "+ao);
        System.out.print("\nDizi Elemanlarının Geometrik Ortalaması: "+go);
        System.out.print("\nDizi Elemanlarının Harmonik Ortalaması: "+ho);
        System.out.print("\nDizi Elemanlarının Kontraharmonik Ortalaması: "+kho);
        
    }   
}
