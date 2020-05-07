import java.util.Scanner;
public class prak4A0085 {
	public static void main (String[] args) {
		
		int alas, tinggi;
		float luas;
		
		Scanner deteksi = new Scanner(System.in);
		System.out.println("Menghitung Volume");
		System.out.println("Masukkan nilai alas: " );
		alas = deteksi.nextInt();
		System.out.print("masukkan nilai tinggi = ");
		tinggi = deteksi.nextInt();
		luas = (alas*tinggi/2);
		System.out.println("Nilai Volume dari " +' '+ alas +' '+ "dan" + ' ' + "adalah = " + luas);
	}
}