/*
Girilen ifadedeki sesli harf sayısını bulma
 */
import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char sesliHarfler[] = {'a','e','i','o','u'};
        int yer[] = new int[255];
        
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        
        int sayac = 0;
        
        for (int i = 0; i <= txt.length()-1; i++) {
            char h = Character.toLowerCase(txt.charAt(i));
            for (int j = 0; j <= sesliHarfler.length-1; j++) {
                if (h==sesliHarfler[j]) {
                    //System.out.println((i+1)+". karakter");
                    yer[sayac] = i+1;
                    sayac++;
                }
            }
        }
        System.out.println("Bu cümlede "+sayac+" tane sesli harf vardır.");
        for (int i = 0; i < sayac; i++) {
            System.out.print(yer[i]+",");
        }
    }
    
}
