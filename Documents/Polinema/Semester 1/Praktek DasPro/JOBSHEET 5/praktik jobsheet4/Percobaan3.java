
import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        int umur;

        Scanner umurnya = new Scanner(System.in);
        System.out.println("Masukkan umur anda : ");
        umur = umurnya.nextInt();
        if(umur > 60){
            System.out.println ("Anda termasuk Lansia");
        }
        else if (umur > 45){
            System.out.println ("Anda termasuk Tua");
        }
         else if (umur > 17){
             System.out.println ("Anda termasuk Dewasa");
        }
         else if (umur > 5) {
             System.out.println("Anda termasuk Anak-anak");
        }
         else if (umur <= 0) {
             System.out.println("Maaf umur yang anda masukkan salah!");
         }
         else {
             System.out.println("Anda termasuk Balita");
         }
    }
}
