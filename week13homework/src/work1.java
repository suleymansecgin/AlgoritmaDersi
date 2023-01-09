/*
1 den n e kadar olan sayıların kareleri toplamını yazdıran metot
 */

public class work1 {
    
    public static void kareleritoplami(int N){
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("1'den "+N+"'e Kadar Olan Sayıların Toplamı: "+sum);
        
    }
    
    public static void main(String[] args) {
        
        kareleritoplami(5);
        
    }
    
}
