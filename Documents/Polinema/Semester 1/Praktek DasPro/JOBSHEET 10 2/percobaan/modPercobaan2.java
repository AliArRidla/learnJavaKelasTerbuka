import java.util.Scanner;

class modPercobaan2 {
    public static void main(String[] args) {
        Scanner scAli = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = scAli.nextInt();

        for (int baris = 1; baris <= n; baris++) {
            for (int i = 1; i <= baris; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}