import java.util.Scanner;
public class prak1b{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int angka,fac,i;
        System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
        System.out.print("Masukkan bilangan : ");
        angka=scAli.nextInt();
        fac=1;
        i=1;
        while (i<=angka)
        {
            fac=fac*i;
            i++;
        }
        System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n",fac);
    }
}
