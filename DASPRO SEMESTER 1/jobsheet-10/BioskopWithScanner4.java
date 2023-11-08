import java.util.Scanner;
public class BioskopWithScanner4 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("Pilih menu (1/2/3): ");
            int PilihanMenu = input04.nextInt();
            input04.nextLine(); 

            switch (PilihanMenu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input04.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input04.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input04.nextInt();
                    input04.nextLine();
                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int a = 0; a< penonton[i].length; a++) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (a + 1) + ": " + penonton[i][a]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih. Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }

            System.out.print("Lanjutkan? (y/n): ");
            String selanjutnya = input04.nextLine();
            if (selanjutnya.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
