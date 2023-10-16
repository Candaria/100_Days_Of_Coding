
import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        int alas = scanner.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        int luas =  alas * tinggi/2 ;

        System.out.println("Luas segitiga adalah " + luas);
    }
}
