
import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.println("Masukkan nilai awal : ");
        int awal = angka.nextInt();
        System.out.println("Masukkan nilai akhir : ");
        int akhir = angka.nextInt();

        for (int i = awal; i <= akhir; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
