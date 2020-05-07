import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Sabar {
    //scanner
    static Scanner input = new Scanner(System.in);

   //variable
   static int[] NoGuru = {0,1,2};
   static int[] NoUrutGuru = new int[10];
   static int[] gabungNoGuru={};
   static int hapus;
   static String[] NGuru = {"","Ali","Baba"};
   static String[] NamaGuru = new String[10];
   static String gabungNamaGuru[];

    //1. Reguler
    //2. Vip
    static int[] Level = {0,1,2};
    static int[] LevelGuru = new int[10];
    static int gabungLevel[];
    static int j = 1;
    static String[] JKelamin = {"","laki-laki","laki-laki"};
    static String[] JenisKelamin = new String[10];
    static String gabungJKelamin[];
    static char kembali = 'y';
    static int data;
    static int cari;
    static int tampung, tampung2, tampung3,tampung4,tampung5, k = 1;
    static String kode[] = new String[30];
    static String ubah;



    //methods

    //method pili untuk penetuan gaji
    public static void pilihpegawai (){
        System.out.println();
        System.out.println("Masukkan No Pegawai :");
        cari = input.nextInt();
        for (int c = 0; c < gabungNoGuru.length; c++) {
            if (cari==(gabungNoGuru[c])) {
                if (gabungNoGuru[c] !=0){
                    System.out.println("============================================");
                    System.out.println("No Pegawai   	    :" + gabungNoGuru[c] + "\t");
                    System.out.println("Nama Pegawai   	    :" + gabungNamaGuru[c] + "\t");
                    // System.out.println("NIP   	    :" + gabungNIP[c] + "\t");
                    System.out.println("Jenis Kelamin   	    :" + gabungJKelamin[c] + "\t");
                    // System.out.println("Alamat   	    :" + gabungadd[c] + "\t");
                    System.out.println("Golongan            :" + gabungLevel[c] + "\t");
                    // System.out.println("Jumlah Anak   	    ::" + gabunganak[c] + "\t");
                    // System.out.println("Jabatan   	    ::" + gabungjabatan[c] + "\t");
                    System.out.println("============================================");
                    }
                }
            
        }
    }
    //method gabungan
    public static void Gabungan(){

        gabungNoGuru = new int[NoGuru.length + NoUrutGuru.length];
        gabungNamaGuru = new String[NGuru.length + NamaGuru.length];
        gabungLevel = new int[Level.length + LevelGuru.length];
        gabungJKelamin = new String[JKelamin.length + JenisKelamin.length];
        
        for (int a = 0; a < NoGuru.length; a++) {
            gabungNoGuru[a] = NoGuru[a];
        }

        for (int a = 0; a < NGuru.length; a++) {
            gabungNamaGuru[a] = NGuru[a];
        }
        for (int a = 0; a < Level.length; a++) {
            gabungLevel[a] = Level[a];
        }
        for (int a = 0; a < JKelamin.length; a++) {
            gabungJKelamin[a] = JKelamin[a];
        }

        //data tetap
        for (int a = NoGuru.length; a < gabungNoGuru.length; a++) {
            gabungNoGuru[a] = NoUrutGuru[a - NoGuru.length];
        }
        for (int a = NGuru.length; a < gabungNamaGuru.length; a++) {
            gabungNamaGuru[a] = NamaGuru[a - NGuru.length];
        }
        for (int a = Level.length; a < gabungLevel.length; a++) {
            gabungLevel[a] = LevelGuru[a - Level.length];
        }
        for (int a = JKelamin.length; a < gabungJKelamin.length; a++) {
            gabungJKelamin[a] = JenisKelamin[a - JKelamin.length];
        }
    }
    //method add
    public static void TambahGuru(){
        while(kembali == 'y' || kembali == 'Y' ){
            data++;
            for (int i = tampung; i < data; i++) {
                Scanner input = new Scanner(System.in);
                System.out.print("Data Guru Ke : " );
                NoUrutGuru[i] = input.nextInt();
                System.out.print("Nama Guru : " );
                NamaGuru[i] = input.nextLine();
                System.out.print("Jenis Kelamin : " );
                JenisKelamin[i] = input.nextLine();
                System.out.println("1. Reguler" );
                System.out.println("2. Vip" );
                System.out.print("Masukkan Level Guru : " );
                LevelGuru[i] = input.nextInt();
                
            }
        
        System.out.println("Tambah data lagi ? y/t : ");
        kembali = input.next().charAt(0);
        }
    }
    //method delete
    public static void HapusGuru(){
        int j;
        while(kembali == 'y' || kembali == 'Y'){
            Gabungan();
           penghapus();
            System.out.println("no.\tNama.\tLevel.\tJenis Kelamin.");
               for (  j = 1; j <gabungLevel.length ; j++) {
                   if(gabungLevel[j]!=0){
                  System.out.print(gabungNoGuru[j]+"\t");
                  System.out.print(gabungNamaGuru[j] + "\t");
                  System.out.print(gabungLevel[j] + "\t");
                  System.out.println(gabungJKelamin[j] + "\t");
                   }
               }
               System.out.print("pilih no yang ingin anda hapus : ");
               hapus=input.nextInt();
               penghapus();
          System.out.println("===============================");                            
          System.out.println("no.\tNama.\tLevel.\tJenis Kelamin.");
          for (  j = 1; j < gabungLevel.length; j++) {
              if(gabungLevel[j]!=0){ 
                  System.out.print(gabungNoGuru[j]-1+"\t");
          System.out.print(gabungNamaGuru[j] + "\t");
          System.out.print(gabungLevel[j] + "\t");
          System.out.println(gabungJKelamin[j] + "\t");
              }
              }
          System.err.println("data Ke " +hapus+ " di hapus ");
          System.out.print("Hapus Data lagi ? y/t  : ");
          kembali = input.next().charAt(0);
       
        
     }
      
        
    }

    static void penghapus(){
        gabungNoGuru[hapus]=0;
        gabungNamaGuru[hapus]=null;
        gabungLevel[hapus]=0;
        gabungJKelamin[hapus]=null;
        

}
    //method edit
    public static void EditGuru()throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j;
        if(data == 1){
            System.err.println("data tidak ada");
        }else{
          
        System.out.println("no.\tnama.\tjabatan.\tjenis kelamin.");
        for ( j = 1; j < data; j++) {
            System.out.print(j + "\t");
            System.out.print(gabungNamaGuru[j] + "\t");
            System.out.print(gabungLevel[j] + "\t");
            System.out.println(gabungJKelamin[j] + "\t");
        }
        System.out.println("\n");

       while(kembali == 'y' || kembali == 'Y'){
        System.out.print("Ubah no : ");
         ubah = br.readLine();
        if(!ubah.matches("[0-9]+")){
       System.err.println("Mohon Masukan Angka!");        
      }else{
            tampung5 = Integer.parseInt(ubah);
        tampung2 = data;
        for (k = tampung5; k < tampung2; k++) {
            System.out.print("Nama : ");
            gabungNamaGuru[k] = br.readLine();
             if(!gabungNamaGuru[k].matches("[a-zA-Z_ ]+")){
                    System.err.println("Mohon Masukan Huruf");
                    tampung2--;
                    break;
                }
            System.out.print("Jabatan : ");
            gabungLevel[k] = input.nextInt();
            //  if(!gabungLevel[k].matches("[1-2]+")){
            //         System.err.println("Mohon Masukan Huruf");
            //         tampung2--;
            //         break;
            //     }
            System.out.print("id : ");
            kode[k] = input.next();
             if(!kode[k].matches("[0-9]+")){
                    System.err.println("Mohon Masukan Huruf");
                    tampung2--;
                    break;
                }
            tampung2 -= tampung2;
        }
    }
           System.out.print("ubah data lagi y/t  : ");
           kembali = input.next().charAt(0);
       }
         }
    }
    //method cari guru
    public static void CariGuru(){
        Gabungan();
        System.out.println();
        System.out.print("Cari Nama Guru : ");
        String cari = input.next();
        for (int c = 0; c < gabungNamaGuru.length; c++) {
            if (cari.equalsIgnoreCase(gabungNamaGuru[c])) {
                System.out.println("============================================");
                System.out.println("No Guru 	:" + gabungNoGuru[c] + "\t");
                System.out.println("Nama Guru 	:" + gabungNamaGuru[c] + "\t");
                System.out.println("Level Golongan  :" + gabungLevel[c] + "\t");
                System.out.println("Jenis Kelamin   :" + gabungJKelamin[c] + "\t");
                System.out.println("============================================");
                
                }else {                    
                    System.out.println("Maaf tidak ada nama yang cocok");
                }
            
        }
        
    }
    //method tampil data guru
    public static void TampilGuru(){
        Gabungan();
        //gabungan data array yang sudah ada dan yang baru 
        // System.out.println("Nama Guru. \t\tLevel Guru. \t\tJenis Kelamin." );
            for (int i=0; i < gabungNamaGuru.length; i++) {
                if(gabungNamaGuru[i] !=null){
                // System.out.print(gabungNamaGuru[i] + "\t\t");
                // System.out.print(gabungLevel[i] + "\t\t");
                // System.out.println(gabungJKelamin[i] + "\t");
                System.out.println("============================================");
                System.out.println("No Guru 	:" + gabungNoGuru[i] + "\t");
                System.out.println("Nama Guru 	:" + gabungNamaGuru[i] + "\t");
                System.out.println("Level Golongan  :" + gabungLevel[i] + "\t");
                System.out.println("Jenis Kelamin   :" + gabungJKelamin[i] + "\t");
        
                }            
            }

    }
    //method gaji
    public static void GajiGuru(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double GajiPegawai = 0;
        double UangLembur = 0;
        double Pengobatan = 0;
        double AkomodasiDanTransportasi = 400000;
        double bpjs = 25000;
        double pph = 79500;
        int golongan;
        char istri = 'y', anak = 'y';
        String pilihan = "";

        double potongan = bpjs + pph;
        double total;

        char putar = 'y';

        int absen = 31;
        String bolos = "", sakit = "", cuti = "";
        int Tcuti = 0, Tbolos = 0, Tsakit = 0;
        int Tgolongan = 0;
        char Kerjalembur = 'y';
        int Tistri = 0;
        int Tanak = 0;
        
        
       TampilGuru();
       pilihpegawai ();
        
        for(int i=0; i<Level.length; i++) {
             int ini = Level[i];
             Tgolongan = ini;
         }
                if (Tgolongan == 1) {
                    GajiPegawai = 4000000;
                } else if (Tgolongan == 2) {
                    GajiPegawai = 3000000;
                }else {
                    System.out.println("Pilihan Tidak ada");

                }

        System.out.print("Lembur? y/t : ");
        Kerjalembur = input.next().charAt(0);
        if (Kerjalembur == 'y') {
            UangLembur = 800000;
        } else {
            UangLembur = 0;
        }

        System.out.print("Status Menikah/belum ? y/t : ");
        istri = input.next().charAt(0);

        if (istri == 'y') {
            Tistri = 190000;
        } else {
            Tistri = 0;
        }

        System.out.print("Mempunyai anak ? y/t : ");
        anak = input.next().charAt(0);
        if (anak == 'y') {
            Tanak = 38000;
        }

        while (!bolos.matches("[0-9]+")) {

            System.out.print("Masukan Berapa hari bolos : ");
            bolos = input.next();
            if (!bolos.matches("[0-9]+")) {
                System.err.println("Mohon Masukan angka");

            } else {
                Tbolos = Integer.parseInt(bolos);
            }
        }

        while (cuti.matches("[0-9]+")) {

            System.out.print("Masukan Berapa hari cuti : ");
            cuti = input.next();
            if (!cuti.matches("[0-9]+")) {
                System.err.println("Mohon Masukan angka");

            } else {
                Tcuti = Integer.parseInt(cuti);
            }
        }
        while (!sakit.matches("[0-9]+")) {
            System.out.print("Masukan Berapa hari sakit : ");
            sakit = input.next();
            if (!sakit.matches("[0-9]+")) {
                System.err.println("Mohon Masukan angka");

            } else {
                Tsakit = Integer.parseInt(sakit);
            }
        }
        if (Tsakit >= 1) {
            Pengobatan = 300000;

        } else if (Tsakit == 0) {
            Pengobatan = 0;
        }

        absen = (absen) - (Tbolos + Tcuti + Tsakit);

        if (absen >= 30) {
            System.out.println("Potongan absen Tidak ada");
            total = (GajiPegawai + UangLembur + Pengobatan + AkomodasiDanTransportasi + Tistri + Tanak) - (potongan);
        } else if (absen >= 20) {
            System.out.println("Gaji di potong 10 %");
            total = total = (GajiPegawai + UangLembur + Pengobatan + AkomodasiDanTransportasi + Tistri + Tanak) - (potongan + 510000);
        } else if (absen >= 10) {
            System.out.println("Gaji di potong 15 %");
            total = total = (GajiPegawai + UangLembur + Pengobatan + AkomodasiDanTransportasi + Tistri + Tanak + istri + anak) - (potongan + 765000);

        } else {

            System.out.println("anda di pecat!");
            GajiPegawai = 0;
            UangLembur = 0;
            Pengobatan = 0;
            AkomodasiDanTransportasi = 0;
            bpjs = 0;
            pph = 0;
            total = 0;

        }
        for (int c = 0; c < gabungNoGuru.length; c++) {
            if (cari==(gabungNoGuru[c])) {
                if (gabungNoGuru[c] !=0){
                System.out.println("============================================");
                System.out.println("No Pegawai   	    :" + gabungNoGuru[c] + "\t");
                System.out.println("Nama Pegawai   	    :" + gabungNamaGuru[c] + "\t");
                // System.out.println("NIP   	    :" + gabungNIP[c] + "\t");
                System.out.println("Jenis Kelamin   	    :" + gabungJKelamin[c] + "\t");
                // System.out.println("Alamat   	    :" + gabungadd[c] + "\t");
                System.out.println("Golongan            :" + gabungLevel[c] + "\t");
                // System.out.println("Jumlah Anak   	    ::" + gabunganak[c] + "\t");
                // System.out.println("Jabatan   	    ::" + gabungjabatan[c] + "\t");
                System.out.println("============================================");
                }
                }
        }
        System.out.println("Jumlah Bolos Kerja : " + bolos);
        System.out.println("Jumlah Sakit : " + sakit);
        System.out.println("Jumlah cuti : " + cuti);
        System.out.println("Jumlah hari Kerja : " + absen);
        System.out.println("==================Potongan====================");
        System.out.println("BPJS    : " + bpjs);
        System.out.println("PPH     : " + pph);
        System.out.println("==================Penghasilan=====================");
        System.out.println("gaji Pokok : " + GajiPegawai);
        System.out.println("Uang Lembur : " + UangLembur);
        System.out.println("Uang Pengobatan : " + Pengobatan);
        System.out.println("Uang Trabsport : " + AkomodasiDanTransportasi);
        System.out.println("Tunjangan Istri : " + Tistri);
        System.out.println("Tunjangan Anak : " + Tanak);
        System.out.println("==================================================");
        System.out.println("Total   : " + total);

    }
    //pilih menu by menu utama
    public static void PilihMenu()throws Exception{
        System.out.print("Pilih menu Yang di Inginkan :");
        int pilih_menu = input.nextInt();
        switch (pilih_menu) {
            case 1:{
                TampilGuru();
                break;
            }
            case 2:{
                TambahGuru();
                break;
            }
            case 3:{
                HapusGuru();
                break;
            }
            case 4:{
                EditGuru();
                break;
            }
            case 5:{
                CariGuru();
                break;
            }
            case 6:{
                GajiGuru();
                break;
            }case 7:{
                break;
            }
        }
        
    }
    //tapilan utama
    public static void MenuUtama()throws Exception{
        System.out.println((char) 27 + "[01;32m===================================" + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;32m     SYSTEM PENGGAJIAN KARYAWAN" + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;32m           MAHESA INSTITUTE" + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;32m===================================" + (char) 27 + "[00;00m");
        System.out.println("1. Menampilkan data karyawan       ");
        System.out.println("2. Menambah data karyawan          ");
        System.out.println("3. Menghapus data karyawan          ");
        System.out.println("4. Edit data karyawan          ");
        System.out.println("5. Mencari Data Karyawan           ");
        System.out.println("6. Slip Gaji");

        System.out.println("===================================");
    }

    public static void main(String[] args)throws Exception {
        char putar = 'y';
        while (putar == 'y' || putar == 'Y') {
        MenuUtama();
        PilihMenu();

        System.out.print("Kembali Ke menu ? y/t : ");
        putar = input.next().charAt(0);
        }
    }
}