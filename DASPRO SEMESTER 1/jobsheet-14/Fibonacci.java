import java.util.Scanner;
public class Fibonacci {
    static int Menghitungmarmut(int bulan) {
        if ( bulan == 1 ) {
            return 0;
        } else if (bulan == 2) {
            return 1;
        } else {
            return Menghitungmarmut(bulan - 1) + Menghitungmarmut(bulan - 2);
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print(" Masukkan bulan : ");
        int bulan = input.nextInt();
        int produktif = Menghitungmarmut(bulan);
        int belumProduktif = Menghitungmarmut(bulan-1);

        System.out.println(" Bulan ke-" + bulan + ":");
        System.out.println(" Jumlah Pasangan Produktif: " +produktif);
        System.out.println(" Jumlah Pasangan belum produktif: " + belumProduktif);
        System.out.println(" Total Pasangan: " +( produktif +belumProduktif));
    }
}