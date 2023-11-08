import java.util.Scanner;
public class Square4 {
    public static void main(String[] args) {
       Scanner Sc4 = new Scanner(System.in);
       System.out.print("Masukkan nilai N =");
       int N = Sc4.nextInt();
       for (int iOuter=1; iOuter<=N; iOuter++){
       for (int i= 1; i<=N; i++){
        System.out.print("*");
       }
       System.out.println();
    }
}
}
