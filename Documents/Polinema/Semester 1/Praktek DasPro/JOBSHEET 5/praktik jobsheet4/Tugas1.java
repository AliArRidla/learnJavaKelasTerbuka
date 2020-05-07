
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        int NilaiPertama;
        int NilaiKedua;
        
        Scanner nilai = new Scanner(System.in);
        System.out.println("Masukkan nilai pertama = ");
        NilaiPertama = nilai.nextInt();
        
        System.out.println("Masukkan nilai kedua = ");
        NilaiKedua = nilai.nextInt();
        
        if(NilaiPertama>NilaiKedua){
            System.out.println("Nilai Terbesar nya adalah = " + NilaiPertama);
        }else{
            System.out.println("Nilai Terbesar nya adalah = " + NilaiKedua);
        }
    }
}
