import java.util.Scanner;
public class prak3c{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int angka,b;
        System.out.println("===PROGRAM LOOP DENGAN BREAK===");
        b=0;
        do
        {
            System.out.println("Masukan bilangan : ");
            angka = scAli.nextInt();
            b += angka;
            if (b>50) break;
        }
        while (true);
        System.out.printf("Angka berhenti pada angka : %d \n", b);
    }
}