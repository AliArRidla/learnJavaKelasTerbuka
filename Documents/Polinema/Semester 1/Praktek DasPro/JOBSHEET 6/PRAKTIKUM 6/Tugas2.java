import java.util.Scanner;
public class Tugas2 {

 public static void main(String[] args) {
 String username, password;
 Scanner input = new Scanner (System.in);
 System.out.println("Masukkan username: ");
 username = input.nextLine();
 if (username.equalsIgnoreCase("Mahasiswa")) {
 System.out.println("Masukkan password: ");
 password = input.nextLine();
 if (password.equals("RaHaSia")) {
 System.out.println("Anda berhasil login");
 }
 else {
 System.out.println("Maaf, password salah");
 }
 }
 else {
 System.out.println("Username tidak ditemukan");
 }
 }
}