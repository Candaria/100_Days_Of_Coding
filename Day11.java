
import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.println("Masukkan Angka1 : ");
        int angka1 = angka.nextInt();

        System.out.println("Masukkan Angka 2 : ");
        int angka2 = angka.nextInt();

        int Pembagian = angka1 / angka2;
        System.out.println("Hasil pembagian adalah : " + Pembagian);
    }
}
