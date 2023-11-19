
import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        int batasawal = 10;
        int batasakhir = 20;
        int total = 0;
        Scanner an = new Scanner(System.in);
        System.out.println("Masukkan batas awal : ");
        int angka1 = an.nextInt();
        System.out.println("Masukkan batas batas akhir  : ");
        int angka2 = an.nextInt();

        for (int i = batasawal; i <= batasakhir; i++) {

            System.out.println(i);

        }
        for (int i = batasakhir; i <= batasawal; i++) {
            System.out.println(i);

        }
        System.out.println("========================");
        for (int i = batasawal; i <= batasakhir; i++) {
            if (i % 5 != 0) {
                total += i;
                System.out.println(i);
            }

        }
        System.out.println("Jumlah total adalah : " + total);
    }
}
