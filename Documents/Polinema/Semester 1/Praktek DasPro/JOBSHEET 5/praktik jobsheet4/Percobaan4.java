import java.util.Scanner;

public class Percobaan4 {
     public static void main(String[] args) {
        double angka1,angka2,hasil;
        char operator;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka pertama = ");
        angka1 = sc.nextDouble();
        System.out.println("Masukkan angka kedua = ");
        angka2 = sc.nextDouble();
        System.out.println("Masukkan operator (+ - * /) : ");
        operator = sc.next().charAt(0);
        
        switch(operator){
			case '+':
			hasil = angka1 + angka2;
			System.out.println(angka1 + " + " + angka2 + " = " + hasil);
			break;
			case '-' :
			hasil = angka1 - angka2;
			System.out.println(angka1 + " - " + angka2  + " = " + hasil);
			break;
			case '*' :
			hasil = angka1 * angka2;
			System.out.println(angka1 + " * " + angka2 + " = " + hasil);
			break;
			case '/' :
			hasil = angka1 / angka2;
			System.out.println(angka1 + " / " + angka2 +  " = " + hasil);
			break;

			default:
			System.out.println("Operator yang anda masukkan salah");
		}
	}
}