/*
Dışarıdan Alınan n değerine göre yıldız yazdıran metot
 */
public class work6 {
    
    public static void yildiz_yazdir(int N){
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
    
        yildiz_yazdir(5);
    
    }
    
}
