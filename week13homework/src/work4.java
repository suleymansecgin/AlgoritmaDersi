/*
İki boyutlu bir diziye 0-üst sınır arası değerler atayıp döndüren metot.
 */
import java.util.Random;
public class work4 {
    
    public static int[][] array_atama(int N, int ub){
        Random r = new Random();
        
        int[][] array = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = r.nextInt(ub);
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        return array;
        
    }
    
    public static void main(String[] args) {
        
        array_atama(5, 50);
        
    }
    
}
