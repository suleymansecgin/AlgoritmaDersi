//dizi elemanlarını tersten yazdırma
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;
        do {
            System.out.print("Lütfen pozitif bir N değeri giriniz: ");
            N = input.nextInt();
        } while (0 > N);

        int[] a = new int[N];
        
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+". eleman: ");   
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length/2; i++) {
            int g = a[i];
            a[i] = a[N-1-i];
            a[N-1-i] = g;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        
    }
    
}
