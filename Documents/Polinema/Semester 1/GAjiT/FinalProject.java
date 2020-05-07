import java.util.Scanner;
import java.util.ArrayList;

public class FinalProject {
   static char kembali = 'y';
   static char kembali1 = 'y';
   static char kembaliMenu = 'y';
    static int data = 0;
    static String[] tambahNama={};
    static String[] tambahLevel={};
    static String[] tambahKelamin={};
    static int[] tambahJadwal={5,6};
    static int data1;
static Scanner scanTambah = new Scanner(System.in);
   public static void TambahData(){
        while(kembali == 'y'||kembali == 'Y'){
            System.out.print("berapa : ");
           data1 = scanTambah.nextInt();
           tambahNama=new String[tambahNama.length+data1];
           tambahLevel=new String[tambahLevel.length+data1];
           tambahKelamin=new String[tambahKelamin.length+data1];
           tambahJadwal=new int[tambahJadwal.length+data1];

         for (int i = 0; i < tambahLevel.length; i++) {
             int simpan = i;
             System.out.println("=========================================");
             System.out.print("Masukkan nama guru : ");
             tambahNama[i] = scanTambah.next();
             System.out.print("Level Guru : ");
             tambahLevel[i] = scanTambah.next();
             System.out.print("Jenis Kelamin");
             tambahKelamin[i] = scanTambah.next();
             System.out.print("Jadwal Mengajar");
             tambahJadwal[i] = scanTambah.nextInt();        
         }
         System.out.println("Mau diulangi ");
         kembali = scanTambah.next().charAt(0);
        }
    }

    public static void EditData(){

    } 
    public static void DeleteData(){

    } 
    public static void CariData(){

    } 

    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        String[] NPegawai = {"Ali","Baba","Ridla"};
        String[] Level = {"VIP","REGULER","VIP"};
        String[] JMengajar = {"3","6","5"};//hari
        int namaku = 1;

        while (kembaliMenu == 'y' || kembaliMenu == 'Y') {
        System.out.println("============== Pilih salah satu sesuai angka ==============" );
        System.out.println("1. Nama Guru");//tambah guru //delete guru //ubah guru //cari guru
        System.out.println("2. Gaji Guru" );
        System.out.println("3. Semua Data Guru" );
        System.out.println("4. Exit" );

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nomor yang anda pilih ?" );
        int pilihan = scan.nextInt();
        while (pilihan == 1 ){
            // System.out.println(nama);
            System.out.println("Nama Guru. \tLevel Guru. \tJenis Kelamin." );
            for (int i=0; i < NPegawai.length; i++) {
                System.out.print(NPegawai[i] + "\t\t");
                System.out.print(Level[i] + "\t\t");
                System.out.println(JMengajar[i] + "\t");
            }
            // Scanner scano = new Scanner(System.in);
            while (kembali1 == 'y' || kembali1 == 'Y') {
            System.out.println("============== Pilih salah satu sesuai angka ==============" );
            System.out.println("1. Tambah Guru");
            System.out.println("2. Edit Guru" );
            System.out.println("3. Delete Guru" );
            System.out.println("4. Cari Guru" );
            // System.out.println("5. Kembali ke menu awal" );
            System.out.print("Masukkan angka yang ingin anda eksekusi : ");
            int pilihan1 = scan.nextInt();
            // int pilihanparse = Integer.parseInt(pilihan1);

            switch (pilihan1) {
                case 1:{
                    TambahData();
                    break;
                }
                case 2:{
                    EditData();
                    break;
                }
                case 3:{
                    DeleteData();
                    break;
                }
                case 4:{
                    CariData();
                    break;
                }
                // case 5:
                    
                    // break;
                
                default:
                System.out.println("Pilihan tidak di temukan");
                    break;
            
        }
            

        System.out.print("lanjut ke menu lagi ? y/t : ");
            kembaliMenu = scan.next().charAt(0);
        }   
        System.out.print("lanjut ke menu lagi ? y/t : ");
            kembaliMenu = scan.next().charAt(0);
        }
    }
    }
    
  
}