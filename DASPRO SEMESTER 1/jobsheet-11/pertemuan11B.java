import java.util.Scanner;
public class pertemuan11B{
    public static void main(String[] args) {
        Scanner Sc4= new Scanner (System.in);
        System.out.print("Masukkan nilai N = ");
        int N= Sc4.nextInt();
        int i=0;
        while(i<=N){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}