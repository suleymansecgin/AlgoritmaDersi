/*
Bir Diziyi Küçükten Büyüğe Doğru Sıralayıp Döndüren Metot
 */
import java.util.Random;
public class work3 {

    public static int[] array_siralama(int array[]) {

        //diziyi küçükten büyüğe sıralama
        int gecici;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[i]) {
                    gecici = array[i];
                    array[i] = array[j];
                    array[j] = gecici;
                }
            }
        }
        //sıralanan diziyi yazdırma
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public static void main(String[] args) {
        
        
        Random r = new Random();
        
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(100);
        }
        
        array_siralama(arr);
    }

}
