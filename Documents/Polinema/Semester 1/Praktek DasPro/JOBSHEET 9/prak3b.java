import java.util.Scanner;
public class prak3b{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int angka,i;
        System.out.println("===PROGRAM LOOP DENGAN BREAK===");
        i=0;
        while (true){
            System.out.println("Masukkan bilangan : ");
            angka=scAli.nextInt();
            i += angka;
            if (i>50) break;
        }
        System.out.printf("Angka berhenti pada : %d \n",i);
    }
}