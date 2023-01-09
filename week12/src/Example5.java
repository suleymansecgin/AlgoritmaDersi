/*
 */
import java.util.Scanner;
import java.util.Random;

public class Example5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Ders Sayısını Giriniz: ");
        int M = input.nextInt();

        System.out.print("Sınıftaki Öğrenci Sayısını Giriniz: ");
        int N = input.nextInt();

        int[][] notlar = new int[M][N];
        int[] ogrencino = new int[N];
        double[] ortalamalar = new double[M];
        int[][] rapor = new int[M][4];

        //random öğrenci no oluşturma
        for (int i = 0; i < N; i++) {
            ogrencino[i] = (int) (10000 + (20000 - 10000) * r.nextDouble());
        }

        for (int i = 0; i < N; i++) {
            System.out.println(i + ". Öğrencin Numarası: " + ogrencino[i]);
        }

        //notlar dizisinin rastgele oluştuma(0-99)
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                notlar[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(i + ". Dersin " + j + ". Öğrencinin Notu: " + notlar[i][j]);
            }
        }

        //ortalamaları hesaplama
        for (int i = 0; i < M; i++) {
            int toplam = 0;
            for (int j = 0; j < N; j++) {
                toplam += notlar[i][j];
            }
            ortalamalar[i] = (double) toplam / N;
        }
        for (int i = 0; i < M; i++) {
            System.out.println((i+1) + ". Dersin Ortalaması: " + ortalamalar[i]);
        }

        //derse ait max min bulma
        for (int i = 0; i < M; i++) {
            int max = notlar[i][0], min = notlar[i][0];
            int maxid = 0, minid = 0;
            for (int j = 0; j < N; j++) {
                if (notlar[i][j] > max) {
                    max = notlar[i][j];
                    maxid = ogrencino[j];
                }
                if (notlar[i][j] < min) {
                    min = notlar[i][j];
                    minid = ogrencino[j];
                }
            }
            rapor[i][0] = max;
            rapor[i][1] = maxid;
            rapor[i][2] = min;
            rapor[i][3] = minid;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println((i+1) + ". Dersin Enleri:" + rapor[i][j]);
            }
            System.out.println("");
        }

    }

}
