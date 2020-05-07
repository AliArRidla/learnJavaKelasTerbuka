/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float  sisi1, sisi2, sisi3 ;
        
        System.out.print("Masukan bilangan sisi 1:");
	sisi1 = sc.nextFloat();
	System.out.print("Masukan bilangan sisi 2:");
	sisi2 = sc.nextFloat();
	System.out.print("Masukan bilangan sisi 3:");
	sisi3 = sc.nextFloat();
        
        if( sisi1 == sisi2 && sisi2!=sisi3 && sisi1!=sisi3 || sisi2==sisi3 && sisi2!=sisi1 && sisi1!=sisi3|| sisi1==sisi3 && sisi2!=sisi1 && sisi2!=sisi3) {
            //jika hanya dua bilangan yang nilainya sama maka segitiga sama kaki
            System.out.print("Maka hasilnya = segitiga sama kaki"); 
	}else if(sisi1 == sisi2 || sisi1==sisi3 || sisi2==sisi3){
            //jika  ketiga bilangan nilainya sama maka cetak segitiga sama sisi
            System.out.print("maka hasilnya = segitiga sama sisi");
	}else 
            //jika ketiga sisinya tidak sama maka cetak segitiga sembarang
            System.out.print("maka hasilnya = segitiga sembarang");
	}
		
    }
    

