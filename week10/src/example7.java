/*
Girilen bir ifadeyi bir baştan bir sondan olacak şekilde yazdıran program
 */
import java.util.Scanner;
public class example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        
        for (int i = 0; i < txt.length()/2; i++) {
            System.out.print(Character.toLowerCase(txt.charAt(i)));
            System.out.print(Character.toLowerCase(txt.charAt(txt.length()-i-1)));
        }
        if (txt.length()%2 == 1) {//Eğer girilen ifadedeki harf sayı tek ise ifadenin ortasındaki harfi yazdırma
            System.out.println(Character.toLowerCase(txt.charAt(txt.length()/2)));
            
        }
    }
    
}
