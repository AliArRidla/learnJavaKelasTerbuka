import java.util.Scanner;
public class tugas1{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        System.out.println("MENGHITUNG JUMLAH BILANAGAN GENAP DARI n BILANGAN ");
        System.out.println("==================================================");
        System.out.println("Range bilangan : ");
        int n=scAli.nextInt();

        int banyak =0;
        int total = 0;
        int bil = 1;

        for (int i=1;i<=n;i++){
            if (i%2==0){
                banyak++;
                total+=i;
            }
        }
        double ratarata = total/banyak;
        System.out.println("Banyaknya bilangan genap dari 1 sampai "+n+" adalah " +banyak);
        for (int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("Bilangan genap ke-"+(bil++)+" adalah " +i);
            }
        }
        System.out.println("Banyaknya bilangan genap dari 1 sampai "+n+" adalah "+banyak);
        System.out.println("Jumlah bilangan genap dari 1 sampai "+n+" adalah "+total);
        System.out.println("Rata-rata bilangan genap dari 1 sampai "+n+" adalah "+ratarata);
    }
}