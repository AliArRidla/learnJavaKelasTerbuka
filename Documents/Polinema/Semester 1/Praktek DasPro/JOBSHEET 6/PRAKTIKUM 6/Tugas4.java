import java.util.Scanner;
public class Tugas4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu, luass, volumee;
        double alas, tinggi, sisi, jari2, luas, volume;
        double phi = Math.PI;
        System.out.println("Pilih menu (1 = luas, 2 = volume)?");
         menu = sc.nextLine();
        if (menu.equals("1")) {
        System.out.println("Pilih hitung luas (a = persegi, b = segitiga)?");
            luass = sc.nextLine();
            if (luass.equals("a")) {
            System.out.println("Masukkan sisi persegi: ");
            sisi = sc.nextDouble();
            luas = sisi*sisi;
            System.out.println("Jadi luas persegi adalah " +luas);
        }
            else {
            System.out.println("Masukkan alas segitiga: ");
            alas = sc.nextDouble();
            System.out.println("Masukkan tinggi segitiga");
            tinggi = sc.nextDouble();
            luas = alas*tinggi/2;
            System.out.println("Jadi luas segitiga adalah " +luas);
         }
 }
 else {
    System.out.println("Pilih hitung volume(a = kubus, b = tabung)?");
    volumee = sc.nextLine();
        if (volumee.equals("a")) {
        System.out.println("Masukkan sisi kubus : ");
        sisi = sc.nextDouble();
        volume = sisi*sisi*sisi;
        System.out.println("Jadi volume kubus adalah " + volume);
 }
 else {
    System.out.print("Masukkan jari-jari tabung:");
    jari2 = sc.nextDouble();
    System.out.print("Masukkan tinggi tabung: ");
    tinggi = sc.nextDouble();
    volume = phi*jari2*jari2*tinggi;
    System.out.println("Jadi volume tabung adalah " + volume);
    
 
    }
}
}
}

