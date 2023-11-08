import java.util.Scanner;
public class tugas104 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input04.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
