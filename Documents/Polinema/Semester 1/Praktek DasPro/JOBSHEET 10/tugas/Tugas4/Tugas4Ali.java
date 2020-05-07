import java.util.Scanner;

class Tugas4Ali {
    public static void main(String[] args) {
        Scanner scAli=new Scanner(System.in);
        System.out.print("MscAliukan Angka:");
        int n=scAli.nextInt();
        if(n>2){
        for(int h=1; h<=n;h++){
        if(h%2 !=0){
            for(int i=1; i<=n; i++){
            System.out.print(i);
            }
        }
        else{
        for(int j=n;j>=1;j--){
            System.out.print(j);
        }
        }
            System.out.println();
        }
        }
    }
}