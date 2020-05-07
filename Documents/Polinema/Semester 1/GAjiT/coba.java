// import java.io.*;
// import java.util.*; 
// import java.util.Scanner;
// import java.util.ArrayList;
// import java.io.IOException;

// class coba {
//     public static void main(String[] args) throws Exception{
//         String[][] namaPegawai = {
//             {"Ali","laki-laki","reguler"},
//             {"Ridla","laki-laki","vip"},
//             {"Mardigu","laki-laki","vip"}
//         };
//         // System.out.println(namaPegawai[0]);

//         //Variabel
//         String pilihMenu;
//         char putar = 'y';
//         String namaBaru;
//         String jenisKelamin;
//         String level;
//         String dataHapus;

//         //Scanner 
//         Scanner scan = new Scanner(System.in);
//         //buffer
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         while(putar == 'y'){
//             System.out.println((char)27+"[01;32m==================================="+(char)27+"[00;00m");
//             System.out.println((char)27+"[01;32m     SYSTEM PENGGAJIAN KARYAWAN"+(char)27+"[00;00m");
//             System.out.println((char)27+"[01;32m            PT ALI BABA"+(char)27+"[00;00m");
//             System.out.println((char)27+"[01;32m==================================="+(char)27+"[00;00m");
//             System.out.println("1. Menambah data karyawan          ");
//             System.out.println("2. Menampilkan data karyawan       ");
//             System.out.println("3. Ubah data karyawan              ");
//             System.out.println("4. Hapus data karyawan             ");
//             System.out.println("5. print gaji                      ");
//             System.out.println("6. Exit");
            
//             System.out.println("===================================");
//             System.out.print(" pilihan Menu: ");
//              pilihMenu = br.readLine();
                           
//              if(!pilihMenu.matches("[0-9]+")){
//                 System. err.print("Mohon Masukan Angka!\n");                      
          
//                } else{
//                 int tampung4 = Integer.parseInt(pilihMenu);
                 
//                 if(tampung4 == 6){
//                     break;
//                 }
//                    switch (pilihMenu) {
//                        case "1":
//                        System.out.print("Namamu : ");
//                        namaBaru = scan.nextLine(); 
//                        System.out.print("Jenis Kelamin : ");
//                        jenisKelamin = scan.nextLine();
//                        System.out.print("Level : ");
//                        level = scan.nextLine();

//                        System.out.println(namaBaru + jenisKelamin + level);


//                            break;

//                         case "2":
//                         for (int i=0; i < namaPegawai.length; i++) {
//                             System.out.println("==========================");
//                             System.out.println("Nama : " + namaPegawai[i][0]);
//                             System.out.println("Jenis Kelamin : " + namaPegawai[i][1]);
//                             System.out.println("Level : " + namaPegawai[i][2]);
//                             System.out.println("--------------------------");

//                         }
//                         System.out.print("Tambah data lagi ? y/t : ");
//                             putar = scan.next().charAt(0);
//                         break;

//                         //belum works!!
//                         case "3":

//                         break;

//                         //belum works!!
//                         case "4":
//                         for (int i=0; i < namaPegawai.length; i++) {
//                             System.out.println("==========================");
//                             System.out.println("Nama : " + namaPegawai[i][0]);
//                             System.out.println("Jenis Kelamin : " + namaPegawai[i][1]);
//                             System.out.println("Level : " + namaPegawai[i][2]);
//                             System.out.println("--------------------------");

//                         }
//                         System.out.print("Masukkan angka yang akan di hapus = ");
//                             dataHapus = br.readLine();
//                             // namaPegawai.removeAll(dataHapus);
//                         break;

//                         //
//                         case "5":
//                         for (int i=0; i < namaPegawai.length; i++) {
//                             System.out.println("==========================");
//                             System.out.println("Nama : " + namaPegawai[i][0]);
//                             System.out.println("Jenis Kelamin : " + namaPegawai[i][1]);
//                             System.out.println("Level : " + namaPegawai[i][2]);
//                             System.out.println("--------------------------");
                            
//                         }

//                         break;
                   
//                        default:
//                            break;
//                    }
//                    System.out.print("lanjut ke menu lagi ? y/t : ");
//                    putar = scan.next().charAt(0);
//                }
              
//         }
        
//     }

    
// }




// import java.util.Arrays;

// public class coba {

//     public static void main(String[] args) {
//         Object[] objArr1 = {"1","2","3"};
//         Object[] objArr2 = {"4","5","6"};
//         //adding an element to array
//         Object[] objArr = add(objArr1, "4");
//         System.out.println(Arrays.toString(objArr));
//         //adding two arrays
//         objArr = add(objArr1, objArr2);
//         System.out.println(Arrays.toString(objArr));
        
//     }
    
//     /**
//      * This method will add elements to an array and return the resulting array
//      * @param arr
//      * @param elements
//      * @return
//      */
//     public static Object[] add(Object[] arr, Object... elements){
//         Object[] tempArr = new Object[arr.length+elements.length];
//         System.arraycopy(arr, 0, tempArr, 0, arr.length);
        
//         for(int i=0; i < elements.length; i++)
//             tempArr[arr.length+i] = elements[i];
//         return tempArr;
        
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class coba {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array :: ");
      int size = sc.nextInt();
      String myArray[] = new String[size];
      System.out.println("Enter elements of the array (Strings) :: ");
      for(int i=0; i<size; i++) {
         myArray[i] = sc.next();
      }
      System.out.println(Arrays.toString(myArray));
      ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
      System.out.println("Enter the element that is to be added:");
      String element = sc.next();
      myList.add(element);
      myArray = myList.toArray(myArray);
      System.out.println(Arrays.toString(myArray));
   }
}