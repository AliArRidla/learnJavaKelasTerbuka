import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        int umur;
        Scanner nilai = new Scanner (System.in);
        System.out.println("Masukkan umur anda = ");
        umur = nilai.nextInt();
        
        if(umur >= 17){
            System.out.println("Umur anda sudah melebihi atau sama dengan " + umur + " jadi anda sudah bisa mengendarai motor");
        }else{
            System.out.println( "Umur anda belum memenuhi standard belum mencapai " + umur + " jadi anda tidak bisa mengendarai motor");
        }
    }
}
