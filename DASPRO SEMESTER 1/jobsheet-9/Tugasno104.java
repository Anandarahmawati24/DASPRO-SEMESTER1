import java.util.Scanner;
public class Tugasno104{
public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
    System.out.println("Input jumlah elemen array : ");
    int jumlahElemen = input04.nextInt();
    int [] Arrayelm = new int [jumlahElemen];
    System.out.println("masukkan " +jumlahElemen+ " angka: ");
    for (int i =0; i<jumlahElemen; i++){
        Arrayelm[i] = input04.nextInt();
    }
        int max = Arrayelm[0];
        int min = Arrayelm[0];
        int total = Arrayelm[0];
    
        for (int i=1; i<jumlahElemen ;i++) {
            if (Arrayelm[i]> max){
                max = Arrayelm[i];
            }
            if (Arrayelm[i]<min) {
                min= Arrayelm[i];  
            }
            total +=Arrayelm[i];
    }
    double Ratarata= total/ jumlahElemen;
    System.out.println("Nilai tertinggi: "+max);
    System.out.println("Nilai terendah: " +min);
    System.out.println("Nilai rata rata: " +Ratarata);

}
}