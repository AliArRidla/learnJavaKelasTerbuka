import java.util.Scanner;
public class Arrayperkalian{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sc1 [][] = new int [2] [2];
		int sc2 [][] = new int [2] [3];
		int sc3 [][] = new int [2] [3];

		System.out.println("Masukkan nilai matriks A : ");
		for (int i = 0; i <2; i++){
			for (int j= 0; j <2; j++) {
				System.out.print("["+i+"] ["+j+"] : ");
				sc1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Masukkan nilai matriks B : ");
		for (int i2 = 0; i2 <2; i2++){
			for (int i3= 0; i3 <2; i3++){
				System.out.print("["+i2+"] ["+i3+"] : ");
				sc2[i2][i3]=sc.nextInt();
			}
		}

		sc3[0][0]= sc1[0][0]*sc2[0][0]+sc1[0][1]*sc2[1][0];
		sc3[0][1]= sc1[0][0]*sc2[0][1]+sc1[0][1]*sc2[1][1];
		sc3[1][0]= sc1[1][0]*sc2[0][0]+sc1[1][1]*sc2[1][0];
		sc3[1][1]= sc1[1][0]*sc2[0][1]+sc1[1][1]*sc2[1][1];

		for (int j1 = 0; j1 <2; j1++) {
			System.out.println(" ");
			for (int j2 = 0; j2 <2; j2++) {
				System.out.print(sc3[j1] [j2]+"\t");
			}
			System.out.print("");
		}
	}
}