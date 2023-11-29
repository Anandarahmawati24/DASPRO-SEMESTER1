import java.util.Scanner;
public class PenjumlahanRekursif {
    static int hitungPenjumlahan( int n){
        if (n == 0){
            return n;
        } else {
            System.out.print(n);
            if (n>1){
                System.out.print(" + ");
            }
            int hasil =  n + hitungPenjumlahan(n-1);
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print(" Masukkan bilangan : ");
        n = sc.nextInt();
        System.out.print(" Hasil  : ");
        int hasil = hitungPenjumlahan(n);
        System.out.println(" = " + hasil);
    }
}