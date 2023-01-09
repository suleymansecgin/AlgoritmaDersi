/*
Klavyeden küçük harflerle girilen bir kelimenin sırasıyla sesli harflerinden k1 
ve sessiz harflerinden k2 kelimesini oluşturup ekrana yazdıran program.
 */
import java.util.Scanner;

public class work4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char sesliHarfler[] = {'a', 'e', 'i', 'o', 'u'};
        String k1 = "";
        String k2 = "";

        System.out.print("Lütfen Bir İfade Giriniz: ");
        String txt = input.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            boolean sesliMi = false;

            for (int j = 0; j < sesliHarfler.length; j++) {
                if (txt.charAt(i) == sesliHarfler[j]) {
                    sesliMi = true;
                    k1 = k1 + txt.charAt(i);
                }
            }
            if (sesliMi == false) {
                k2 += txt.charAt(i);
            }
        }
        System.out.println(k1);
        System.out.println(k2);
    }

}
