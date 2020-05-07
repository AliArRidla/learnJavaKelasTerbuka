import java.util.Scanner;
public class tugas2{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int angka,fac,i,bil,jumlah,avg,banyak;
        System.out.println("===MENGHITUNG JUMLAH KUADRAT BILANGAN GANJIL DARI n BILANGAN===");
        System.out.println("RANGE BILANAGAN : ");
        angka=scAli.nextInt();
        banyak=1;
        avg=0;
        fac=0;
        bil=1;
        for(i=1;i<=angka;i++){
            if (i%2!=0){
                System.out.println("Bilangan ganjil ke- "+(bil++)+" adalah "+i);
                jumlah=fac+=i*i; 
                avg=jumlah/banyak;
                banyak++;
            }
        }
        System.out.println("Jumlah bilangan ganjil dari 1 sampai "+angka+" : "+fac);
        System.out.println("Rata-rata bilangan ganjil dari 1 sampai "+angka+" : "+avg);
    }
}