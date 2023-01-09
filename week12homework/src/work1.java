/*
N tane şirketin bir yıla ait aylık kar oranları, bilgisayara girilmektedir.Buna göre;
i. Herbir şirketin yıllık ortalama kar miktarlarını,
ii.Herbir şirketin en az ve en fazla kar elde ettiği ayları ve miktarlarını,
iii.Herbir aya ait en az ve en fazla kar miktarlarını ve şirketleri veren program.
 */

import java.util.Scanner;
import java.util.Random;

public class work1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Şirket Sayısını Giriniz: ");
        int sirketsayisi = input.nextInt();

        //12 = ay
        int sirket[][] = new int[sirketsayisi][12];

        //Herbir şirketin herbir aydaki kar oranını kullanıcıdan alma.
        for (int i = 0; i < sirketsayisi; i++) {
            for (int j = 0; j < 12; j++) {
                sirket[i][j] = r.nextInt(100);
            }
        }

        //Şirketlerin kar oranlarını yazdırma
        for (int i = 0; i < sirketsayisi; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println(i + 1 + ". Şirketin " + (j + 1) + ". Ay Kar Oranı: " + sirket[i][j]);
            }
        }
        //Herbir şirketin yıllık kar oranını hesaplama.
        double karoranlari[] = new double[sirketsayisi];

        for (int i = 0; i < sirketsayisi; i++) {
            int toplam = 0;
            for (int j = 0; j < 12; j++) {
                toplam += sirket[i][j];
            }
            karoranlari[i] = (double) toplam / 12;
        }

        for (int i = 0; i < sirketsayisi; i++) {
            System.out.println((i + 1) + ". Şirketin Bir Yıldaki Kar Oranı: %" + karoranlari[i]);
        }

        //Herbir şirketin en az ve en fazla kar elde ettiği aylar ve miktarları.
        for (int i = 0; i < sirketsayisi; i++) {
            int minkaray = 1;
            int maxkaray = 1;
            int minkar = sirket[0][0];
            int maxkar = sirket[0][0];
            for (int j = 0; j < 12; j++) {
                if (sirket[i][j] < minkar) {
                    minkaray = (j + 1);
                    minkar = sirket[i][j];
                }
                if (sirket[i][j] > maxkar) {
                    maxkaray = (j + 1);
                    maxkar = sirket[i][j];
                }
            }

            System.out.println((i + 1) + ". Şirket için: ");
            System.out.println("En Az Kar Yapığı Ay: " + minkaray + "\nMiktarı: " + minkar);
            System.out.println("En Fazla Kar Yaptığı Ay: " + maxkaray + "\nMiktarı: " + maxkar);

        }

        //Herbir ay için en fazla ve en az kar miktarı ve şirketi
        for (int i = 0; i < 12; i++) {
            int sirketmax = sirket[0][i];
            int sirketmin = sirket[0][i];
            int sirketmaxay = 1;
            int sirketminay = 1;
            for (int j = 0; j < sirketsayisi; j++) {
                if (sirket[j][i] > sirketmax) {
                    sirketmax = sirket[j][i];
                    sirketmaxay = (j + 1);
                }
                if (sirket[j][i] < sirketmin) {
                    sirketmin = sirket[j][i];
                    sirketminay = (j + 1);
                }
            }

            System.out.println((i + 1) + ". Ay En Çok Kar Yapan Şirket " + sirketmax + " ile " + sirketmaxay + ". Şirket");
            System.out.println((i + 1) + ". Ay En Az Kar Yapan Şirket " + sirketmin + " ile " + sirketminay + ". Şirket");

        }
    }

}
