/*
 */
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(i+1+". harf: "+txt.charAt(i));
        }
        
        if (txt.equals("Emrah")) {
            System.out.println("Evet");
        }else
            System.out.println("Hayır");
    }    
}
