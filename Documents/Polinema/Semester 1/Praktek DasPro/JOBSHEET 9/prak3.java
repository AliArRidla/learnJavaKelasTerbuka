import java.util.Scanner;
public class prak3{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int angka,i;
        System.out.println("===PROGRAM LOOP DENGAN BREAK===");
        for (i=0; true;){
            System.out.println("Masukkan angka : ");
            angka=scAli.nextInt();
            i += angka;

            if (i>50) break;
        }
        System.out.printf("Angka berhenti pada jumlah angka : %d \n", i);
    }
}