package pasha;
// Drive Class
import java.util.Scanner;
public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Nama anda");
        String Nama = in.nextLine();
        System.out.println("Masukkan ID Anda");
        int id = in.nextInt();
        System.out.println("Masukkan ipk anda ");
        double ipk = in.nextDouble();
        
        // membuat obyek
        Siswa rufat = new Siswa(id , Nama , ipk);
        // Siswa wildan = new Siswa();
        // Siswa rani = new Siswa(10, "Rani", 90);
        // rufat.id = 100;
        // rufat.nama = "Rufat";
        // rufat.ipk = 9;
        

        // System.out.println(rufat.id);
        // System.out.println(rufat.nama);
        // System.out.println(rufat.ipk);
        // System.out.println("Ini Data Rufat");
        // System.out.println(rufat.id);
        // System.out.println(rufat.nama);
        // System.out.println(rufat.ipk);
        // System.out.println("Ini Data Wildan");
        //  System.out.println(wildan.id);
        //  System.out.println(wildan.nama);
        //  System.out.println(wildan.ipk);
         
         //Nilai diatas 75 lulus
         if (rufat.getIpk() > 75) {
            System.out.println(" LULUS");
         }else {
            System.out.println(" Tidak Lulus");
         }



        // Nilai huruf
        if (rufat.getIpk() < 60) {
        System.out.println("E");
        } else if (rufat.getIpk() >= 61 && rufat.getIpk() <= 70  ) {
        System.out.println("D");    
        } else if (rufat.getIpk() >= 71 && rufat.getIpk() <= 80  ) {
            System.out.println("C");    
        } else if (rufat.getIpk() >= 81 && rufat.getIpk() <= 90  ) {
            System.out.println("B");    
        } else if (rufat.getIpk() >= 91 && rufat.getIpk() <= 100  ) {
            System.out.println("A");    
        }
        in.close();
        
    
    }   
} 
