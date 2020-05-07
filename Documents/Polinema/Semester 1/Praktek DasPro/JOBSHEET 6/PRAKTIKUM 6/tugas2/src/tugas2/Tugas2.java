/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
          
         String username,password;
         
        System.out.print("Masukan username : ");
	username = sc.nextLine();
        
         if (username.equalsIgnoreCase("mhs")){
              System.out.println ("username tidak ditemukan");
            }
           else if (username.equals("MAHAsiswa")) {
            System.out.println("Masukan Password Anda :");
            password = sc.nextLine();
             if (password.equals("RaHasia")){
              System.out.println("Selamat Anda Berhasil Login");   
             }
             else { 
                System.out.println(" Password Anda Salah :"); 
             }
           } else{ 
         System.out.println(" Maaf ,password salah :") ;}
           }
    }


                    
            


    

