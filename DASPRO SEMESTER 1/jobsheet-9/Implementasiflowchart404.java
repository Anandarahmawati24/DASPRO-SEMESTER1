import java.util.Scanner;
public class Implementasiflowchart404{
public static void main(String[] args) {
    int [] arrayBil = new int [8];
    Scanner input04 = new Scanner(System.in);
    System.out.println("Masukan 8 bilangan bulat: ");

    for (int i=0; i<8; i++) {
        System.out.println("Elemen ke-" + (i+1)+ " : ");
        arrayBil[i]=input04.nextInt();
        
    }
    int total =0;
    for(int i=0; i<8; i++){
        total += arrayBil[i];
    }
    double rataRata = total/8;
    System.out.println(" Rata - Rata dari seluruh elemen array adalah: " +rataRata);
}
}