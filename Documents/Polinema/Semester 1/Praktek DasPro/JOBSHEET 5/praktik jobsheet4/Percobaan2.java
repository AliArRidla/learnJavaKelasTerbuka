
import java.util.Scanner;
public class Percobaan2 {
    public static void main(String[] args) {
        int bil1,bil2,total,rata2;

        Scanner angka = new Scanner(System.in);
        System.out.println("Masukkan angka pertama : ");
        bil1 = angka.nextInt();
        System.out.println("Masukkan angka kedua : ");
        bil2 = angka.nextInt();
        total = (bil1 + bil2) / 2;
        rata2 = total;
        System.out.println("Print rata2 = " + rata2);
        if (rata2 >= 100) {
            rata2 -= 5;
            System.out.println("Hasil akhir nya adalah " + rata2);
        } else {
            System.out.println("Hasil akhir nya adalah " + rata2);
        } 
    }
}
