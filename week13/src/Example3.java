/*
 */

public class Example3 {

    public static int incrementby(int num, int index) {
        
        num += index;
        return num;
        
    }

    public static void main(String[] args) {
        int sayi = 10;
        System.out.println("Arttırmadan Önce Sayı: "+sayi);
        sayi = incrementby(sayi, 2);
        System.out.println("Arttırdıktan Sonra Sayı: "+sayi);
    }

}
