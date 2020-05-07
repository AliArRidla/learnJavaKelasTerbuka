import java.util.Scanner;
public class Tugas3 {
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    String makanan, ekspres;
    int hargamakan, biayakirim, total;
    System.out.println("Masukkan nama makanan: ");
    makanan = sc.nextLine();
    System.out.println("Masukkan harga makanam: Rp ");
    hargamakan = sc.nextInt();
    ekspres = sc.nextLine();
    System.out.println("Apakah anda ingin pengiriman ekspres(0 = tidak 1 = ya)?");
    ekspres =sc.nextLine();
    if (ekspres.equals("1")) {
    if (hargamakan < 100000) {
    biayakirim = 45000;
    }
    else {
    biayakirim = 55000;
    }
    total = hargamakan + biayakirim;
    System.out.println("STRUK PEMBELIAN");
    System.out.println("makanan +\t\t\t Rp " +
    hargamakan);
    System.out.println("Biaya pengiriman \t\t Rp " +
    biayakirim);
     System.out.println("--------------------------------------------");
    System.out.println("TOTAL \t\t\t\t Rp " + total);
    }
    else {
    if (hargamakan < 100000) {
    biayakirim = 20000;
    }
    else {
    biayakirim = 30000;
    }
     total = hargamakan + biayakirim;
     System.out.println("STRUK PEMBELIAN");
     System.out.println("makanan + \t\t\t Rp " +
    hargamakan);
    System.out.println("Biaya pengiriman \t\t Rp " +
    biayakirim);
    System.out.println("-------------------------------------------");
    System.out.println("TOTAL \t\t\t\t Rp " + total);
    }
 }
}