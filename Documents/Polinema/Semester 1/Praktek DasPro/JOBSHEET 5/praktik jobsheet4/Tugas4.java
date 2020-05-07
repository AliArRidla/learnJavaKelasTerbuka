
import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int TotalGaji, GajiPokok, UangMakan, UangTransport, TotalGajiBersih;
    
    System.out.println("Masukkan Gaji Pokok = ");
    GajiPokok = input.nextInt();
    System.out.println("Masukkan Uang Makan = ");
    UangMakan = input.nextInt();
    System.out.println("Masukkan Uang Transport = ");
    UangTransport = input.nextInt();
    
    TotalGaji = GajiPokok + UangMakan + UangTransport;
    TotalGajiBersih = TotalGaji * 10/100;
    
    System.out.println("Gaji Bersih adalah = " + TotalGajiBersih);
    }
}
 