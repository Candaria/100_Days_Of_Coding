
import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {

        int bilangan;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();

        while (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap");
            System.out.print("Masukkan bilangan lagi: ");
            bilangan = input.nextInt();

            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil");
        }
    }
}
