/*
Girilen bir sayının asal olup olmadığını yazdıran metot
 */

import java.util.Scanner;

public class work2 {

    public static boolean asalMi(int num) {
        int sayac = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int num = input.nextInt();

        if (asalMi(num)) {
            System.out.println(num + " Sayısı Asal Sayıdır.");
        } else {
            System.out.println(num + " Sayısı Asal Değildir.");
        }

    }

}
