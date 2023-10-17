
import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {

        Scanner angka = new Scanner(System.in);

        System.out.println("Masukkan angka1 : ");
        int angka1 = angka.nextInt();

        System.out.println("Masukkan angka2 : ");
        int angka2 = angka.nextInt();

        int perkalian = angka1 * angka2;
        System.out.println("Hasil perkalian adalah ; " + perkalian);
    }
}
