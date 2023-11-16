
import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if ((angka % 2 == 1 && i % 2 == 1) || (angka % 2 == 0 && i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
