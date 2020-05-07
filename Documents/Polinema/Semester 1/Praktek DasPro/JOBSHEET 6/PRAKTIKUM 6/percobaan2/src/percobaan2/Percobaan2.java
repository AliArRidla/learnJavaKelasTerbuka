/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Percobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner (System.in);
       int penghasilan,gajibersih;
       double pajak = 0;
       String kategori;
       
       System.out.print("Masukan Kategori:");
        kategori = sc.nextLine();
        
        System.out.print("Masukan besarnya penghasilan:");
        penghasilan = sc.nextInt();
        
        
        if (kategori.equalsIgnoreCase("pekerja")){
            if (pengasilan <= 2000000){
                pajak = 0.1;
            } else if (penghasilan <= 2000000){
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajibersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.print("Gaji bersih yang anda terima :" + gajibersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (pengasilan <= 2500000){
                pajak = 0.15;
            } else if (penghasilan <= 3500000){
                pajak = 0.2;
            }else {
                pajak = 0.25;
            }
            gajibersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.print("Gaji bersih yang anda terima :" + gajibersih);
        } else {
            System.out.print("Kategori yang Anda masukan salah");
        }
    }
    
}
