/*
girilen bir ifadeyi harf-sayı şeklinde yazdıran program
 */
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i)); 
            System.out.print(i+1);
        }
    }
    
}
