import java.util.Scanner;
public class Star4 {
    public static void main(String[] args) {
        Scanner input04= new Scanner(System.in);
        System.out.print("masukkan nilai N =");
        int N = input04.nextInt();

        for(int i=0;i<=N; i++){
            System.out.print("*");
       }
    }
}