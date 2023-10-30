
import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan :");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap. Silakan masukkan kembali");
        } else {
            System.out.println("You and I, end.");

        }
    }
}
