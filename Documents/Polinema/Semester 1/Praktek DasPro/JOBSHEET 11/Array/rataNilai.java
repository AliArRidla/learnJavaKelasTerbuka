import java.util.Scanner;

class rataNilai {
    public static void main(String[] args) {
        int[] nilaiMHS = new int[10];
        int total = 0;
        double rata;
        Scanner scAli = new Scanner(System.in);

        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke - " + (i + 1) + ":");
            nilaiMHS[i] = scAli.nextInt();
        }
        for (int i = 0; i < nilaiMHS.length; i++) {
            total += nilaiMHS[i];
        }
        rata = total / nilaiMHS.length;
        System.out.println(rata);
    }
}