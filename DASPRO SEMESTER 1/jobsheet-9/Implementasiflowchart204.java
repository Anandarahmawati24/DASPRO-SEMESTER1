public class Implementasiflowchart204{
    public static void main(String[] args) {
        int [] arrayBil = new int [10];
        for (int i=0; i<10; i++){
            arrayBil[i]= i+1;
        }
            for (int i=9; i>=0; i--) {
                System.out.println(arrayBil[i]+ " ");
            }
    }   
}