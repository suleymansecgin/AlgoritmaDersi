/*
 */
import java.util.Random;

public class Example5 {
    
    public static int[] arr(int ub,int N){
        Random r = new Random();
        
        int array[] = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(ub);
        }
        
        
        for (int i = 0; i < N; i++) {
            System.out.println(array[i]); 
        }
        
        return array;

    }
    
    public static void main(String[] args) {
        int numbers[] = arr(50,5);
    }
    
}
