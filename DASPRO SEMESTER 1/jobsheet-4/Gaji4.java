import java.util.Scanner;
public class Gaji4 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int jmlMasuk, JmlTdkMasuk,BesarGaji, potGaji, TotGaji;
        System.out.println("Masukkan Jumlah Gaji ");
        BesarGaji=input.nextInt();
        System.out.println(" Masukkan Jumlah Potongan Gaji ");
        potGaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        TotGaji=(jmlMasuk*BesarGaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

    }
}