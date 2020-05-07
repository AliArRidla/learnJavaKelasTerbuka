import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) {
        Scanner scAli = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int n = scAli.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}