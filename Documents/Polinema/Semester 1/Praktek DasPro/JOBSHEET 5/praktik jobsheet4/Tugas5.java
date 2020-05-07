import java.util.Scanner;
public class Tugas5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TotalBelanja;
		float Silver,HasilSilver,Gold,HasilGold,Platinum,HasilPlatinum;

		System.out.println("Masukkan Total Belanja: ");
		TotalBelanja = sc.nextInt();
		if (TotalBelanja>1000000){
			System.out.println("Anda mendapat potongan member PLATINUM sebesar 10%");
			System.out.println("Total Belanja Anda adalah : " + TotalBelanja);
			Platinum = (TotalBelanja * 10/100);
			System.out.println("Potongan diskon member adalah : " + Platinum);
			HasilPlatinum = TotalBelanja - Platinum;
			System.out.println("Total Bayar Anda adalah : " + HasilPlatinum);
		}
		else if(TotalBelanja>500000) {
			System.out.println("Anda mendapat potongan member GOLD sebesar 5%");
			System.out.println("Total Belanja Anda Adalah : " + TotalBelanja);
			Gold = (TotalBelanja * 5/100);
			System.out.println("Potongan diskon member adalah : " + Gold);
			HasilGold = TotalBelanja - Gold;
			System.out.println("Total Bayar Anda Adalah : " + HasilGold);
		}
		else if (TotalBelanja>200000) {
			System.out.println("Anda mendapat potongan member SILVER sebesar 2%");
			System.out.println("Total Belanja Anda Adalah : " + TotalBelanja);
			Silver = (TotalBelanja * 2/100);
			System.out.println("Potongan diskon member adalah : " + Silver);
			HasilSilver = TotalBelanja - Silver;
			System.out.println("Total Bayar Anda Adalah : " + HasilSilver);
		}
		else{
			System.out.println("Total belanja anda masih kurang untuk mendapatkan diskon member");
			System.out.println("Total Bayar Anda adalah : " + TotalBelanja);
		}
	}
}