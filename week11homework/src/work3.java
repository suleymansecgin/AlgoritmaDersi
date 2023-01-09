/*
Klavyeden rastgele büyüklükte harfle girilen kelimenin harflerinin büyüklüklerinin tersini alarak 
(büyükse küçük, küçükse büyük yaparak) yeniden yazdıran program.
 */
import java.util.Scanner;

public class work3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            int a = txt.charAt(i);
            if (a >= 65 && a <= 90) {
                int c = a + 32;
                char d = (char) a;
                System.out.print(d);
            } else {
                int e = a - 32;
                char f = (char) e;
                System.out.print(f);
            }
        }
    }

}
