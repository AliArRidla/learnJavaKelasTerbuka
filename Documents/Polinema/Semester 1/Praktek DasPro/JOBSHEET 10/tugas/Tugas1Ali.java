import java.util.Scanner;
public class Tugas1Ali {
    public static void main(String[] args){
        Scanner scAli=new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai N : ");
        n=scAli.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=n-i; j>0; j--){
                System.out.print(" ");}
            
                for(int l=1;l<=i;l++){
                    System.out.print(l);
                }
                
                System.out.println("");
            
        }
    }
}