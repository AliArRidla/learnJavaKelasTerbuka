
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        int UAS,UTS,TUGAS,QUIZ,nilai;
        int persentase = 100;
                
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan nilai UAS = ");
                UAS = input.nextInt();
                System.out.print("Masukkan nilai UTS = ");
                UTS = input.nextInt();
                System.out.print("Masukkan nilai TUGAS = ");
                TUGAS = input.nextInt();
                System.out.print("Masukkan nilai QUIZ = ");
                QUIZ = input.nextInt();
                
                UAS = UAS * 40 / persentase;
                UTS = UTS * 30 / persentase;
                TUGAS = TUGAS * 20 / persentase;
                QUIZ = QUIZ * 10 / persentase;
                
                nilai = UAS + UTS + TUGAS + QUIZ ;
                if(nilai < 65){
                    System.out.println("REMIDI");
                }else {
                    System.out.println("LULUS");
                }
             
    }
}
