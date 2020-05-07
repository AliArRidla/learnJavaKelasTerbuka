import java.util.Scanner ;
public class Tugas02 {
	public static void main (String[] args) {
		float suhu ;
		int celcius;
		int reamur;
		int fahrenheit;
		double kelvin;
		
		Scanner li = new Scanner(System.in);
		System.out.println("Program konversi suhu : ");
		System.out.println("Masukkan nilai suhu celcius = ");
		celcius = li.nextInt();
		System.out.println("Suhu dalam celcius = " + celcius);
		reamur = 4 * celcius / 5;
		System.out.println("Suhu dalam reamur = " + reamur);
		fahrenheit = (9*celcius/5) + 32;
		System.out.println("Suhu dalam fahrenheit = " + fahrenheit);
		kelvin = celcius + 273;
		System.out.println("Suhu dalam kelvin = " + kelvin);
	}
}