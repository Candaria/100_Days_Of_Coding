import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        if (angka >= 100 )  {
            System.out.println(angka + " adalah angka ratusan.");
        } else if (angka >= 10) {
            System.out.println(angka + " adalah angka puluhan.");
        } else {
            System.out.println(angka + " bukan angka puluhan atau ratusan.");
        }

        scanner.close();
    }
}
