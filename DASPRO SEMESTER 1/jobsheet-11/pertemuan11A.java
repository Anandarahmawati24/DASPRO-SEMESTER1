import java.util.Scanner;
public class pertemuan11A {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = input04.nextInt();

        for (int i = N; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}