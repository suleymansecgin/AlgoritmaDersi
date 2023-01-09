/*
Klavyeden küçük harflerle girilen bir cümlenin harflerini rastgele büyüklükte yeniden yazdıran program.
 */
import java.util.Scanner;
import java.util.Random;

public class work2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Bir cümle giriniz: ");
        String txt = input.nextLine();
        
        for (int i = 0; i < txt.length(); i++) {
            int x = r.nextInt();
            if (x % 2 == 0) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }else{
                System.out.print(txt.charAt(i));
            }
        }
    }
    
}
