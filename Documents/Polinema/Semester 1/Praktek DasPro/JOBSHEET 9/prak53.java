import java.util.Scanner;
public class prak53{
    public static void main(String args[]){
        Scanner scAli=new Scanner(System.in);
        int a=5;
        for (int b=1; b<=a ; b++){
            for (int c=5 - b;c > 0;c--){
                System.out.print(" ");
            }
            for(int k=1;k<=b;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}