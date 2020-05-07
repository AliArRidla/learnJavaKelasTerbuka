import java.util.Scanner;

class Tugas3Ali {
    public static void main(String[] args) {
        Scanner scAli = new Scanner(System.in);
        int n;
        System.out.print("Masukan Nilai N :");
        n=scAli.nextInt();
     
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print(n);
            }
                else{
                        System.out.print(" ");}
            
            
            }
            System.out.println("");
        }
    }
}