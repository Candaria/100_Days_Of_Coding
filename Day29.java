
import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        int batasAtas;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas atas : ");

        batasAtas = input.nextInt();

        int total = 0;
        for (int i = 1; i <= batasAtas; i++) {
            System.out.println(i);
            total += i;
        }
        System.out.println("Total penjumlahan = " + total);
    }
}
