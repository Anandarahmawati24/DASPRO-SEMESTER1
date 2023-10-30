import java.util.Scanner;

public class LinearSearch04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ditemukan dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }
    }
}
