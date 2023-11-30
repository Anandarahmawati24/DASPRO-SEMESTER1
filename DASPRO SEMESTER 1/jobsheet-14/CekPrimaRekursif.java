import java.util.Scanner;
public class CekPrimaRekursif {
    static boolean cekPrimaRekursif(int n, int i){
     if ( n<= 1){
        return false;
     } 
     if ( i == 1){
        return true;
     }
     if (n % 1 == 0){
        return false;
     }
     return cekPrimaRekursif(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print(" Masukkan Bilangan: ");
        int n = input.nextInt();
        if (cekPrimaRekursif(n, n/ 2)){
            System.out.println( n + " adalah bilangan prima ");
        }else {
            System.out.println( n + " bukan bilangan prima ");
        }
    }
}