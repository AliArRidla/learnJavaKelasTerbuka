/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner (System.in);
        
        int nilai;
        
        System.out.print("Masukan nilai ujian (0-100):");
        nilai = sc.nextInt();
        
        if (nilai >= 0 && nilai <= 100){
            if (nilai >= 90 && nilai <=99){
            System.out.println ("Nilai A,EXCELLENT!");
            }else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Nilai B,pertahankan prestasi Anda!");
             }else if (nilai >= 60 && nilai <=79) {
            System.out.println("Nilai C,pertahankan prestasi Anda!");
             }else if (nilai >= 50 && nilai <= 59) {
            System.out.println("Nilai D,pertahankan prestasi Anda!");
             }else  {
            System.out.println("Nilai E,Anda tidak lulus!");
             }
        } else if (nilai < 0) {
            System.out.println("Nilai yang anda masukan kurang dari 0");
        }}else (nilai > 100); {
            System.out.println("Nilai yang anda masukan lebih dari 100");
    
}

    private static class nilai {

        public nilai() {
        }
    }
}

    