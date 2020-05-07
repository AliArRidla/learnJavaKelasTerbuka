import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int[] bil = new int[5];
        bil[0] = 5;
        bil[1] = 12;
        bil[2] = 7;
        bil[3] = 20;
        bil[4] = 90;

        for (int i = 0; i < 5; i++) {
            System.out.println(bil[i]);
        }

    }
}

// indeks terbesar adalah 4
// indeks terkecil adalah 0

// error karena yang variabel yang kita punya adalah int 
// keluaran nya sama ,karena menggunakan perulangan
