import java.util.Scanner;

class ArrayInputLoop {
    public static void main(String[] args) {
        Scanner scAli = new Scanner(System.in);
        int[] nilaiUas = new int[6];

        for (int i = 0; i < nilaiUas.length; i++) {
            System.out.print("Masukkan nilai ke " + i + " : ");
            nilaiUas[i] = scAli.nextInt();
        }

        // for (int q = 0; q < 6; q++) {
        // System.out.println("Nilai Uas ke - " + q + " adalah " + nilaiUas[q]);
        // }

        for (int i = 0; i < nilaiUas.length; i++) {
            if (nilaiUas[i] > 70) {
                System.out.println("Mahasiswa " + i + " lulus");
            } else {
                System.out.println("Mahasiswa " + i + " Tidak lulus");
            }
        }

    }
}

// kegunaan nya menghitung secara otomatis
//