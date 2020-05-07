import java.util.Scanner;
public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner inputAli =new Scanner (System.in);
        int bil;
        System.out.println("Masukkan Sebuah Bilangan: ");
        bil=inputAli.nextInt();
        
        String output = (bil%2==0) ?"Bilangan Genap":"Bilangan Ganjil";
        System.out.println(output);
        }
    }
