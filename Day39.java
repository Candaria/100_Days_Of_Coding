
import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.println("masukkan batas awal:");
        int batasawal = angka.nextInt();

        System.out.println("masukkan batas akhir");
        int batasakhir = angka.nextInt();

        int total = 0;

        for (int i = batasawal; i < batasakhir; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "+");

                total += i;

            }

        }
        System.out.print("=" + total);

    }
}
