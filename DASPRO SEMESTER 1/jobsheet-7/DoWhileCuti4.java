import java.util.Scanner;
public class DoWhileCuti4{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.println(" Jatah cuti :  ");
        jatahCuti = sc.nextInt();
        do {
            System.out.println(" Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.println(" Jumlah hari:  ");
            jumlahHari = sc.nextInt();
            
            if (jumlahHari<= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println(" Sisa jatah cuti: " +jatahCuti);
            } else {
                System.out.println(" Sisa jatah cuti anda tidak mencukupi");
                System.out.println(" Silahkan masukkan hari yang sesuai.");;
            } 
        } else if (konfirmasi.equalsIgnoreCase("t")){
            break;
        }
    } while (true);
}
}