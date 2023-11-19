
import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {

        Scanner an = new Scanner(System.in);
        System.out.println("Masukkan nilai awal : ");
        int angkaawal = an.nextInt();
        System.out.println("Masukkan nilai akhir : ");
        int angkaakhir = an.nextInt();

        for (int i = angkaawal; i <= angkaakhir; i++) {
            if (i % 2 == 0) {
                System.out.println("nilai ini adalah bilangan genap : " + i);
            }

        }
        for (int i = angkaawal; i <= angkaakhir; i++) {
            if (i % 2 != 0) {
                System.out.println("nilai ini adalah bilangan ganjil : " + i);
            }

        }
    }
}
