import java.util.Scanner;
import java.util.Random;
public class Quiz4 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner input04 = new Scanner(System.in);
    char menu ='y';
    do{
        int number = random.nextInt(10)+1;
        boolean success = false;
        do{
            System.out.print(" Tebak angka (1-10):");
            int answer = input04.nextInt();
            input04.nextLine();
            if (answer < number) {
                System.out.println("Tebakan Anda terlalu kecil. Coba lagi.");
            } else if (answer > number) {
                System.out.println("Tebakan Anda terlalu besar. Coba lagi.");
            } else {
                System.out.println("Selamat! Anda menebak dengan benar.");
                success = true;
            }
        }while (!success);
        System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
        menu = input04.nextLine().charAt(0);
    }while(menu=='y' || menu=='Y');
  }  
}