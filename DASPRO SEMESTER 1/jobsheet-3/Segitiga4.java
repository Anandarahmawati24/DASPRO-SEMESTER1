import java.util.Scanner;
public class Segitiga4 {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int alas, tinggi;
    float luas;
    System.out.println("\t Menghitung luas segitiga: ");
    System.out.println(" inputkan alas: ");
    alas = sc.nextInt();
    System.out.println(" inputkan tinggi:");
    tinggi = sc.nextInt();
    luas = alas *tinggi/2;
    System.out.println(" Luas segitiga: " + luas);

}
}