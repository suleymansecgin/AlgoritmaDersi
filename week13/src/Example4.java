/*
 */
import java.util.Scanner;

public class Example4 {
    
    public static int assign_num(){
        Scanner input = new Scanner (System.in);
        int sayi;
        do {
            System.out.print("0-100 Arası Sayı Giriniz: ");
            sayi = input.nextInt();
        } while (sayi<0 || sayi>100);  
        
        return sayi;
    }
    
    public static int assign_num(int lb,int ub){
        Scanner input = new Scanner (System.in);
        int sayi;
        do {
            System.out.print("0-100 Arası Sayı Giriniz: ");
            sayi = input.nextInt();
        } while (sayi<lb || sayi>ub);  
        
        return sayi;        
    }
    
    public static void main(String[] args) {
        
        int numbers[] = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+". İndex: ");
            numbers[i] = assign_num();
        }
    }
    
}
