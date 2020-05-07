import java.util.Scanner;
public class prak52{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int r=1;
        int i=1;
        int a=2;
        int n=4;

        while (i<=n){
            r=r*a;
            i++;
        }
        System.out.print(r);
    }
}