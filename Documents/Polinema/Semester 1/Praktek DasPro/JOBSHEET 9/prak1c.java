import java.util.Scanner;
public class prak1c{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int angka,fac,i;
        System.out.println("===PROGRAM MENGHITUNG NILAI DO-WHILE===");
        System.out.println("Masukan angka : ");
        angka=scAli.nextInt();
        fac=1;
        i=1;
        do
        {
            fac = fac*i;
            i++;
        }
        while (i<=angka);
        System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n",fac);
    }
}