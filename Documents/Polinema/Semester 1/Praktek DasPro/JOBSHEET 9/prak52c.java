import java.util.Scanner;
public class prak52c{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int n=5;
        long hasil=1;
         for(int i=1;i<=n;i++){
             hasil=hasil*i;
         }
    System.out.print(n+"!="+hasil);
    }
}