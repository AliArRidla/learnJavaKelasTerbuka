import java.util.Scanner;

public class contohinput2{
    public static void main (String [] args){
        Scanner scAli = new Scanner(System.in);
        int panjang,lebar;
        System.out.print("Msukan panjang =");
        panjang = scAli.nextInt();
        System.out.print("Msukan lebar =");
        lebar = scAli.nextInt();
        System.out.print("Nilai dari panjang = "+ panjang);
        System.out.print("Nilai dari Lebar = " + lebar);
    }
}