import java.util.Scanner;

class Arrayinputloop {
	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);

		int[] nilaiUAS=new int[6];

		for(int i=0;i<6;i++)
		{
			System.out.print("Masukkan nilai UAS ke-" +i+":");
			nilaiUAS[i]= input.nextInt();
		}
		for (int i=0;i<6;i++)
		{
			System.out.println("Nilai UAS ke-"+i+"adalah:"+nilaiUAS[i]);
		}
	}
}

