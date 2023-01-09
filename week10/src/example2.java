/*

 */
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        
        System.out.print("Lütfen bir harf giriniz: ");
        char ch = input.nextLine().charAt(0);
        int s = 0;
        
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ch) {
                System.out.print((i+1)+",");
                s++;
            }
        }
        
        System.out.println("\n"+ch+" "+s+ " kadar cümlede geçmektedir");
        
    }
    
}
