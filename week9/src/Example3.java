import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        do {
            System.out.print("Sınıf Mevcudunu Giriniz: ");
            N = input.nextInt();
        } while (0 > N);

        int[] sinif = new int[N];
        
        for (int i = 0; i < sinif.length; i++) {
            System.out.print((i+1)+". Öğrencini Notu: ");
            sinif[i] = input.nextInt();
        }
        
        for (int i = 0; i < sinif.length; i++) {
            System.out.println((i+1)+". Öğrencinin Notu: "+sinif[i]);
        }
        
        int T = 0;
        
        for (int i = 0; i < sinif.length; i++) {
            T += sinif[i];
        }
        double ort = T/sinif.length;
        
        int gecen=0;
        for (int i = 0; i < sinif.length; i++) {
            if (sinif[i]<ort) {
                System.out.println((i+1)+". Öğrenci Kaldı");
            }
            if (sinif[i]>=ort) {
                System.out.println((i+1)+". Öğrenci Geçti");
                gecen++;
            }
        }
        System.out.println(gecen+" kişi geçti...");
        System.out.println(sinif.length-gecen+ " kişi kaldı...");
    }
}
