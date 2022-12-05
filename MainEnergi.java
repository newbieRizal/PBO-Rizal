
import java.util.Scanner;

public class MainEnergi{
    public static void main(String args[]){
        int m = 0;
        int v= 0;
        double hasil1;
        Scanner simpan = new Scanner (System.in);
        System.out.println("Masukkan Massa benda =");
        m = simpan.nextInt();
        System.out.println("Masukkan kecepatan benda");
        v = simpan.nextInt();
        hasil1 = 0.5*m*(v*v);
        
    }
}