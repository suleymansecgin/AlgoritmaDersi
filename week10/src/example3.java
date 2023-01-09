/*
Girilen cümleyi tersten yzdıran program
 */
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        for (int i = txt.length()-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(txt.charAt(i)+" , ");
            }else
                System.out.print(txt.charAt(i));
            
        }
    }
    
}
