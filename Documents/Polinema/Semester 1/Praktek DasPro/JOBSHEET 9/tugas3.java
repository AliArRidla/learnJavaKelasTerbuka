import java.util.Scanner;
public class tugas3{
    public static void main(String args[]){
    int a;
    int b = 1;
    int c= 0; 
    int hasil;
    Scanner scAli=new Scanner(System.in);
    System.out.println("Bilangan : ");
    a=scAli.nextInt();

    for (int i=1;i<=a;i++){
        b=c;
        hasil=b+c;
        System.out.print( hasil + " ");
    }
      
}
}