import java.util.Scanner;
public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input04.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0,totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input04.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rataLulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus  = " + rataTidakLulus);
    }
}