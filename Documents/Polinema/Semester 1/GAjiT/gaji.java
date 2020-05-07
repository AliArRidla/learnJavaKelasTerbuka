import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class gaji {

    static void strukGaji()throws Exception {
        //scanner
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date();

        //variable
        double gapok = 0;
        double lembur = 0;
        double pengobatan = 0;
        double transport = 400000;
        double bpjs = 25000;
        double pph = 79500;
        String golongan = "";
        char istri = 'y',anak = 'y';
        double potongan = bpjs + pph;
        double total;
        char balik = 'y';
        int absen = 31 ;
        String bolos = "",sakit = "",cuti="";
        int Tcuti =0, Tbolos=0,Tsakit=0;
        int Tgolongan  = 0;
        char Kerjalembur = 'y';
        int Tistri = 0;
        int Tanak =0 ;
        

        //golongan 
            System.out.println("1. Golongan Vip");
            System.out.println("2. Golongan Reguler");
            // System.out.println("3. Golongan c");
             
             while(!golongan.matches("[0-9]+")){
           
                System.out.print("Masukan golongan : ");
                golongan = br.readLine();
                   if(!golongan.matches("[0-9]+")){
                       System.err.println("Mohon Masukan angka");
                  
                 
                 
                   }else{
                       Tgolongan = Integer.parseInt(golongan);
                 
                        if(Tgolongan == 1){
                            gapok = 70000;
                        }else if (Tgolongan == 2){
                            gapok = 50000;
                        }else{
                            System.out.println("Pilihan Tidak ada");
                
                
                        }
                   }
            }
              
             
            //lembur 
            System.out.print("Lembur? y/t : ");
            Kerjalembur = input.next().charAt(0);
            if(Kerjalembur == 'y'){
                lembur = 400000;
            }else{
                lembur = 0;
            }
            
            System.out.print("Status Menikah/belum ? y/t : ");
            istri = input.next().charAt(0);
            
            if(istri == 'y'){
               Tistri = 190000;
            }else{
                Tistri = 0;
            }
            
            System.out.print("Mempunyai anak ? y/t : ");
            anak = input.next().charAt(0);
            if(anak == 'y'){
               Tanak = 38000 ;
            }
            
            
            
           
             //bolos
             while(!bolos.matches("[0-9]+")){
           
                System.out.print("Masukan Berapa hari bolos : ");
                bolos = br.readLine();
                  if(!bolos.matches("[0-9]+")){
                    System.err.println("Mohon Masukan angka");
                  
                  
                  }else{
                    Tbolos = Integer.parseInt(bolos);
                  }
             }
                 
             //cuti
           while(!cuti.matches("[0-9]+")){
           
                System.out.print("Masukan Berapa hari cuti : ");
           cuti = br.readLine();
             if(!cuti.matches("[0-9]+")){
                  System.err.println("Mohon Masukan angka");
                  
            }else{
                Tcuti = Integer.parseInt(cuti);
            }
           }


           //sakit
             while(!sakit.matches("[0-9]+")){
                 System.out.print("Masukan Berapa hari sakit : ");
            sakit = br.readLine();
             if(!sakit.matches("[0-9]+")){
                  System.err.println("Mohon Masukan angka");                  
            }else{
                Tsakit = Integer.parseInt(sakit);
            }
             }
            if(Tsakit >=1){
                 pengobatan = 300000;
            }else if(Tsakit == 0){
                 pengobatan = 0;
            }
            absen = (absen)-(Tbolos+Tcuti+Tsakit);            
        if (absen >= 30) {
            System.out.println("Potongan absen Tidak ada");
             total = (gapok + lembur + pengobatan + transport+Tistri+Tanak) - (potongan);
        } else if (absen >= 20) {
            System.out.println("Gaji di potong 10 %");
            total = total = (gapok + lembur + pengobatan + transport+Tistri+Tanak) - (potongan + 510000);
        } else if (absen >= 10) {
            System.out.println("Gaji di potong 15 %");
            total = total = (gapok + lembur + pengobatan + transport+istri+anak) - (potongan + 765000);
        

        } else {
            
      System.out.println("anda di pecat!");
      gapok = 0;
      lembur = 0;
      pengobatan = 0;
      transport = 0;
      bpjs = 0;
      pph = 0 ;
      total = 0;

        }
        
        System.out.println("Jumlah Bolos Kerja : " + bolos);
        System.out.println("Jumlah Sakit : " +sakit);
        System.out.println("Jumlah cuti : "+cuti);
        System.out.println("Jumlah hari Kerja : "+absen);
        
            
            
        System.out.println("==================Potongan====================");
        System.out.println("BPJS    : " + bpjs);
        System.out.println("PPH     : " + pph);
        System.out.println("==================Penghasilan=====================");   
        System.out.println("gaji Pokok : " + gapok);
        System.out.println("Uang Lembur : " + lembur);
        System.out.println("Uang Pengobatan : " + pengobatan);
        System.out.println("Uang Trabsport : " + transport);
        System.out.println("Tunjangan Istri : "+Tistri);
        System.out.println("Tunjangan Anak : "+Tanak);  
        System.out.println("Total   : " + total);
        System.out.println("Tanggal : "+ date.toString());
        
    
     
    
           
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pilih ;
        char balik = 'y';
        
         
        String nama[] = new String[30];
        String jabatan[] = new String[30];
        String kode[] = new String[30];
        int KemunculanDdata[] = new int[30];
        int jumlah, tmp,h;
        //int j;
         
        int data = 1;
        
        int tampung, tampung2, tampung3,tampung4,tampung5, k = 1;
        int i = 1;
        String ubah ;
                int j;


                //aplikasi ini adalah sistem pembayaran gaji karyawan guru kursusan 
                //gaji tergantung VIP dan REGULER 
                //jika VIP = 50.000 perHari
                //jika Reguler = 70.000 perHari
                //dipotong asuransi BPJS dan PPH
                //BPJS = 25.000
                //PPH = 795.000 
                //full seminggu =
                //lembur = 
                //cuti = 

                //tampilan awal
        while (balik == 'y' || balik == 'Y') {
            System.out.println((char)27+"[01;32m==================================="+(char)27+"[00;00m");
            System.out.println((char)27+"[01;32m     SYSTEM PENGGAJIAN KARYAWAN"+(char)27+"[00;00m");
            System.out.println((char)27+"[01;32m            PT ALI BABA"+(char)27+"[00;00m");
            System.out.println((char)27+"[01;32m==================================="+(char)27+"[00;00m");
            System.out.println("1. Menambah data karyawan          ");
            System.out.println("2. Menampilkan data karyawan       ");
            System.out.println("3. Ubah data karyawan              ");
            System.out.println("4. Hapus data karyawan             ");
            System.out.println("5. Cari data karyawan" );
            System.out.println("6. print gaji                      ");
            System.out.println("7. Exit");
            
            System.out.println("===================================");
            System.out.print(" pilihan Menu: ");
                      
             pilih = br.readLine(); 
                  if(!pilih.matches("[0-9]+")){
                   System. err.print("Mohon Masukan Angka!\n");                      
             
                  } else{     
                 tampung4 = Integer.parseInt(pilih);
                 
                 if(tampung4 == 6){
                     break;
                 }


                 //proses pemilihan dengan swith case 
            switch (tampung4) {
                //jika memilih satu
                case 1:
                    while (balik == 'y' || balik == 'Y') {
                      data++;
                        tampung = i;                        
                        for (i = tampung; i <data; i++) {
                            System.out.println("Data Karyawan Ke : " + i);
                            System.out.print("Nama       : ");
                            nama[i] = br.readLine();
                            if(!nama[i].matches("[a-zA-Z_ ]+")){
                                System.err.println("Mohon Masukan Huruf");
                                data--;
                                break;                                                                
                            }                                                             
                            System.out.print("Jabatan    : ");
                            jabatan[i] = br.readLine();
                             if(!jabatan[i].matches("[a-zA-Z_ -]+")){
                                System.err.println("Mohon Masukan Huruf");
                                data--;
                                break;                                
                            }
                            System.out.print("id         : ");
                            kode[i] = br.readLine();
                             if(!kode[i].matches("[0-9]+")){
                                System.err.println("Mohon Masukan angka");
                                data--;
                                break;                                
                            }                            
                            System.out.println("\n");                            
                            }                                               
                        System.out.print("Tambah data lagi ? y/t : ");                        
                        balik = input.next().charAt(0);
                    }                      
                    break;

                    //jika memilih dua
                case 2:
                    if(data == 1){
                        System.err.println("data tidak ada");
                    }else{                    
                    System.out.println("no.\tnama.\tjabatan.\tid.");
                    for ( j = 1; j < data; j++) {
                        System.out.print(j + "\t");
                        System.out.print(nama[j] + "\t");
                        System.out.print(jabatan[j] + "\t");
                        System.out.println(kode[j] + "\t");
                    }
                }
                    break;

                    //jika memilih tiga
                case 3:                    
                     if(data == 1){
                        System.err.println("data tidak ada");
                    }else{                      
                    System.out.println("no.\tnama.\tjabatan.\tid.");
                    for ( j = 1; j < data; j++) {
                        System.out.print(j + "\t");
                        System.out.print(nama[j] + "\t");
                        System.out.print(jabatan[j] + "\t");
                        System.out.println(kode[j] + "\t");
                    }
                    System.out.println("\n");
                   while(balik == 'y' || balik == 'Y'){
                    System.out.print("Ubah no : ");
                     ubah = br.readLine();                     
                    if(!ubah.matches("[0-9]+")){
                   System.err.println("Mohon Masukan Angka!");                                
                  }else{                        
                        tampung5 = Integer.parseInt(ubah);
                    tampung2 = data;
                    for (k = tampung5; k < tampung2; k++) {
                        System.out.print("Nama : ");
                        nama[k] = br.readLine();
                         if(!nama[k].matches("[a-zA-Z_ ]+")){
                                System.err.println("Mohon Masukan Huruf");
                                tampung2--;
                                break;
                            }
                        System.out.print("Jabatan : ");
                        jabatan[k] = br.readLine();
                         if(!jabatan[k].matches("[a-zA-Z_ ]+")){
                                System.err.println("Mohon Masukan Huruf");
                                tampung2--;
                                break;                                
                            }
                        System.out.print("id : ");
                        kode[k] = br.readLine();
                         if(!kode[k].matches("[0-9]+")){
                                System.err.println("Mohon Masukan Huruf");
                                tampung2--;
                                break;
                            }
                        tampung2 -= tampung2;
                    }
                }
                       System.out.print("ubah data lagi y/t  : ");
                       balik = input.next().charAt(0);                    
                   }
                     }
                     break;
            //jika memilih angka 4
                case 4:
                    
                    System.out.println("\n");
                     while(balik == 'y' || balik == 'Y'){
                    if(data == 1){
                        System.err.println("data tidak ada");
                        break;
                    }else{
                    System.out.println("no.\tnama.\tjabatan.\tid.");
                    for ( j = 1; j < data; j++) {
                        System.out.print(j + "\t");
                        System.out.print(nama[j] + "\t");
                        System.out.print(jabatan[j] + "\t");
                        System.out.println(kode[j] + "\t");
                    }
                            System.out.println("\n");                     
                     data--;
                    i--;
                    
                    if(i<1){
                        i++;
                    }
                            if(data<1){
                                data++;
                            }       
                
                        System.out.println("===============================");                            
                    System.out.println("no.\tnama.\tjabatan.\tid.");
                    for ( j = 1; j < data; j++) {
                         System.out.print(j + "\t");
                        System.out.print(nama[j] + "\t");
                        System.out.print(jabatan[j] + "\t");
                        System.out.println(kode[j] + "\t");
                    }
                     System.err.println("data Ke " +data+ " di hapus ");
                      System.out.print("Hapus Data lagi ? y/t  : ");
                    balik = input.next().charAt(0);
                     
                    }
                     }
                    break;

                case 5:

                System.out.println("gaji pokok golongan pertama = 400000");
                System.out.println("gaji pokok golongan kedua = 300000");
                System.out.println("gaji pokok golongan ketiga = 200000\n");
                    System.out.println("no.\tnama.\tjabatan.\tid.");
                    for ( j = 1; j < data; j++) {
                        System.out.print(j + "\t");
                        System.out.print(nama[j] + "\t");
                        System.out.print(jabatan[j] + "\t");
                        System.out.println(kode[j] + "\t");
                    }                    
                    if(data == 1){
                        System.err.println("data tidak ada");
                    }else{                     
                    while(balik == 'y'|| balik == 'Y'){    
                    System.out.print("pilih no yang akan di print gaji :  ");
                    String gaji;
                    gaji = br.readLine();                    
                    if(!gaji.matches("[0-9]+")){
                   System.err.println("Mohon Masukan Angka!");                                         
                  }else{
                    int tampung6 = Integer.parseInt(gaji);            
                    tampung3 = data;
                    for ( j = tampung6; j < tampung3; j++) {
                        System.out.println("Nama : " + nama[j]);
                        System.out.println("Nama : " + jabatan[j]);
                        System.out.println("ID : " + kode[j]);
                        tampung3 -= tampung3;
                    }                    
                    strukGaji();
                    }                    
                        System.out.print("Pilih no data lagi y/t : ");
                        balik = input.next().charAt(0);                    
                    }
                 }
                    break;
                default:
                    System.out.println("Pilihan tidak di temukan");
                    break;
            }                        
            System.out.print("lanjut ke menu lagi ? y/t : ");
            balik = input.next().charAt(0);}
        }
    
    }
}