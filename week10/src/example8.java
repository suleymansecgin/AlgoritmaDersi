/*
Klavyeden girilen bir cümlede kaç tane kelime olduğunu bulan program.
 */
import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char isaret[] = {' ',',',';','.',':','!'};
        
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        
        int sayac = 0;
        
        for (int i = 0; i < txt.length(); i++) {
            for (int j = 0; j < isaret.length; j++) {
                if (txt.charAt(i) == isaret[j]) {
                    sayac++;
                }
            }
        }
        
        System.out.println("Cümlede "+sayac+" tane kelime vardır.");
        
    }
    
}
