
import java.util.Scanner;
import java.util.Random;

public class Example1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        //N pozitif tam sayı değerini konsoldan alma
        int N;
        do {
            System.out.print("Lütfen pozitif bir N değeri giriniz: ");
            N = input.nextInt();
        } while (0 > N);

        //N uzunluğunda bir dizi tanımlama
        int[] randomsayi = new int[N];

        //randomsayı dizisine 0-99 arası sayılar atama
        for (int i = 0; i < randomsayi.length; i++) {
            randomsayi[i] = r.nextInt(100);
        }
        
        //dizi elemanlarını yazdırma
        for (int i = 0; i < randomsayi.length; i++) {
            System.out.println((i + 1) + ". eleman " + randomsayi[i]);
        }
        
        //randomsayı dizisinde minimum elemanı bulma
        int min = randomsayi[0];//0.elemanın dizinin minimum elemanı olduğunu varsaydık.
        int max = randomsayi[0];//0.elemanın dizinin maximum elemanı olduğunu varsaydık.
        int minindex = 0;
        int maxindex = 0;
        for (int i = 1; i < randomsayi.length; i++) {
            if (randomsayi[i] < min) {
                min = randomsayi[i];//i. indeks değerini min'e ata.
                minindex = i;
            }
            if (randomsayi[i] > max) {
                max = randomsayi[i];//i. indeks değerini max'a ata. 
                maxindex = i;
            }
        }
        
        System.out.println("Minimum eleman " + minindex+". indeksteki "+min+" değeridir...");
        System.out.println("Maximum eleman " + maxindex+". indeksteki "+max+" değeridir...");
        
    }
}
