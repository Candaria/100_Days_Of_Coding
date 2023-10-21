
import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);

        System.out.println("Masukkan Nilai1 : ");
        int nilai1 = nilai.nextInt();

        System.out.println("Masukkan Nilai2 :");
        int nilai2 = nilai.nextInt();

        if (nilai1 > nilai2) {
            System.out.println("Nilai1 lebih besar dari Nilai2");
        } else if (nilai1 < nilai2) {
            System.out.println("Nilai1 lebih kecil dari Nilai2");

        } else {
            System.out.println("Nilai1 sama dengan Nilai2");
        }
    }

}
