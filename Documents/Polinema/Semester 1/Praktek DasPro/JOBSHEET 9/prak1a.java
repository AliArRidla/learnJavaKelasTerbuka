import java.util.Scanner;
public class prak1a{
public static void main(String args[]){
    int angka,fac,i;
    System.out.println("======PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
    System.out.print("Masukkan bilangan : ");
    Scanner input=new Scanner(System.in);
    angka=input.nextInt();
    fac=1;
    for (i=1;i<=angka;i++)
    {
        fac= fac*i;
    }   
    System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n", fac);
    }

}
