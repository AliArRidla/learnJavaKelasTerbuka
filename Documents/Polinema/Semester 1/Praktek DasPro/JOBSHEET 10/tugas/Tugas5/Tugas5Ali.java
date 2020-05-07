import java.util.Scanner;

class Tugas5Ali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Masukan Nilai N :");
        n=input.nextInt();
        for(int a=1; a<=n; a++){
           
        
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
}