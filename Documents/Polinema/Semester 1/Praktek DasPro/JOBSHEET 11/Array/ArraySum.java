import java.util.Scanner;

class ArraySum {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int sum=0;
		int n;

		System.out.print ("Masukkan isi array :");
			n= input.nextInt();

			int[] jml= new int[n];
		for (int i = 0; i<jml.length; i++)
		{
			System.out.print ("Masukkan array ke-"+i+":");
			jml[i] = input.nextInt();
			sum+=jml[i];

		}
			System.out.println ("Hasil penjumlahan isi elemen array:"+sum);
	}
}