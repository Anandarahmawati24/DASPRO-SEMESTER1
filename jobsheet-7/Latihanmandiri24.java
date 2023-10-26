import java.util.Scanner;
public class Latihanmandiri24{
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int jumlahMahasiswa= 2, jumlahPerempuan=0 ;
        char jenisKelamin;
        String nama;

        System.out.println(" Masukkan nama dan jenis kelamim Mahasiswa: ");
        while ( jumlahPerempuan< jumlahMahasiswa){
            System.out.print("Nama Mahasiswa:  ");
            nama= input04.nextLine();

            System.out.print(" Jenis Kelamin (L/P):  ");
            jenisKelamin= input04.nextLine().charAt(0);

            if (jenisKelamin == 'P' || jenisKelamin=='p') {
            System.out.println(" Mahasiswa Perempuan: " +nama);
            jumlahPerempuan++;
           }  
          }
        }
    }