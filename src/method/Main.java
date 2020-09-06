package method;
class Mahasiswa {
    String nama;
    String NIM;

    //Constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }
    //method tanpa return 
    void show (){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }
    // method tanpa return tapi ada parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method return tanpa parameter

    String getNama(){
        return this.nama;
    }
    
    String getNIM() {
        return this.NIM;
    }

    // method return + parameter ya
    String sayHI(String msg){
        return msg + "juga nama saya" + this.nama;
    }
}


public class Main{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("ALI","1010");
        mhs1.show();
        mhs1.setNama("tutung");
        mhs1.show();
        
        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getNIM());

        String data = mhs1.sayHI("ganteng");
        System.out.println(data);
    }
}