/*
Girilen cümleyi tersten ve harflerini küçük/büyük yazdıran program.
 */


import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        
        int sayac = 0;
        for (int i = txt.length()-1; i >= 0; i--) {
            if (sayac % 2 == 0) {
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }else{
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            sayac++;
        }
    }
}
