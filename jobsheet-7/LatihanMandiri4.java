import java.util.Scanner;
public class LatihanMandiri4{

public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
    int jumlah = 0;
    

    for ( int i = 25 ; i >= 1 ; i--){
        if ( i > 0) {
            jumlah += i;
        }
    }
    System.out.println(" Jumlah Deret bilangan adalah " + jumlah);
}
}