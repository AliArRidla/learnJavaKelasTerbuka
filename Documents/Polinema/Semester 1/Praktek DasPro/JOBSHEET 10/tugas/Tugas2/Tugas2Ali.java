import java.util.Scanner;

public class Tugas2Ali {
    public static void main(String[] args){
        Scanner scAli = new Scanner(System.in);
        int n;
        System.out.print("Masukan Nilai N :");
        n=scAli.nextInt();
        for(int a=n; a>0; a--){
           for(int b=n; b>a; b--){
           System.out.print(" ");
           }
           for(int c=1; c<=a;c++){
               System.out.print("*");
           }
           for(int g=1;g<=a-1;g++){
               System.out.print("*");
           }
           System.out.println();
           }
        
       for(int iouter=1; iouter<=n; iouter++){
           for(int i=n; i>iouter; i--){
           System.out.print(" ");
           }
           for(int k=1; k<=iouter;k++){
               System.out.print("*");
           }
           for(int j=1;j<=iouter-1;j++){
               System.out.print("*");
           }
           System.out.println();
           }
    }
    
}