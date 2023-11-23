public class programku4 {
  public static void TampilHinggaKei(int i) {
    for (int j=1; j<=i; j++){
        System.out.print(j);
    }
  }  

  public static int Jumlah (int bill1, int bill2) {
return (bill1+bill2);
  }

  public static void Tampiljumlah (int bill1, int bill2){
    TampilHinggaKei(Jumlah(bill1, bill2));
  }

  public static void main(String[] args) {
    int temp = Jumlah (1,1);
    Tampiljumlah(temp, 5);
  }
}