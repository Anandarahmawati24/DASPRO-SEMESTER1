import java.util.Scanner;
public class BioskopWithScanner4{
    public static void main(String[] args) {
        Scanner input04= new Scanner(System.in);
        int baris,kolom;
        String nama, next;
        String [][] penonton = new String [4][2];
        
        while (true) {
            System.out.print("Masukkan nama: ");
            nama =input04.nextLine();
            System.out.print(" Masukkan baris: ");
            baris = input04.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input04.nextInt();
            input04.nextLine();

            penonton [baris -1][kolom-1] = nama;

            System.out.print("Input penonton lainnya?? (y/n): ");
            next = input04.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}