
import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.println("Masukkan angka 1: ");
        int angka1 = angka.nextInt();

        System.out.println("Masukkan angka 2: ");
        int angka2 = angka.nextInt();

        int pengurangan = angka1 - angka2;

        System.out.println("Hasil pengurangan: " + pengurangan);
    }
}
