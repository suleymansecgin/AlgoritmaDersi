import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        do {
            System.out.print("Fibonacci sayı dizisinin eleman sayısını giriniz: ");
            N = input.nextInt();
        } while (0>N);
        
        int fibonacci[] = new int[N];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        
        for (int i = 2; i < fibonacci.length; i++) {
            int yeni = fibonacci[i-1]+fibonacci[i-2];
            fibonacci[i] = yeni;
        }

        for (int i = 0; i < fibonacci.length; i++) {
            if (i == fibonacci.length-1) {
                System.out.print(fibonacci[i]);
            }
            else {
                System.out.print(fibonacci[i]+",");
            }
        }
    }
}
