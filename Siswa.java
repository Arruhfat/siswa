package pasha;
// Objec Class
public class Siswa {
    int id;
    String nama;
    double ipk;
     /* Constructor
    */public  Siswa(){
        id = 0;
        nama = "";
        ipk = 0;

    
      
    }
    // Constructor Parameter
    public Siswa(int id,  String nama,double ipk) {
       this. id = id ;
       this. nama = nama ;
       this. ipk= ipk;
    }

    //Getter-->mendapatkan nilai-->tipe data
    public int getId() {
        return id;
    }
    public String getNama(){
        return nama;
    }
    public double getIpk() {
        return ipk;

    }

    //Setter-->mengubah nilai-->void

    public void setId(int id) {
    this.id = id;

    }


    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
          
    }


    //method
    public void println() {
        System.out.println("Ini data dari siswa"+ nama);
        System.out.println("Id : " + id);
        System.out.println("Ipk"+ ipk);
    }


    //method yang menghasilkan value
    public String print2() {
        return "ID : " + id
        + "\nNama : " + nama
        + "\nIPK : " + ipk;

    
    
}   


}
    

