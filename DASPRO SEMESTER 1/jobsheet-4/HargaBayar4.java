import java.util.Scanner;
import java.util.scanner;
public class HargaBayar4 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int harga, jumlah, jumlahHalaman;
        String MerkBuku;
        double dis, total, bayar, jmlDis;
        
        System.out.println("Masukkan Merk Buku ");
        MerkBuku=input.next();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Jumlah Halaman buku ");
        jumlahHalaman=input.nextInt();
        System.out.println(" Masukkan jumlah diskon ");
        dis=input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
        
    }
}