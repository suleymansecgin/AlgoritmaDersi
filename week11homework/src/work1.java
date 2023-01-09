/*
Klavyeden küçük harflerle girilen bir kelimenin harflerini iki büyük ve iki küçük harf şeklinde yaparak tekrar yazdıran bir program
 */
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir kelime giriniz: ");
        String txt = input.nextLine();
        
        int s = 0;
        
        for (int i = 0; i < txt.length(); i++) {
            if (s % 4 < 2) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }else{
                System.out.print(txt.charAt(i));
            }
            s++;
        }
    }
    
}
