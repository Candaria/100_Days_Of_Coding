
import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        if (angka1 > angka2) {
            System.out.println(angka1 + " lebih besar dari " + angka2);
        } else if (angka1 < angka2) {
            System.out.println(angka1 + " lebih kecil dari " + angka2);
        } else {
            System.out.println("Kedua angka sama besar, yaitu " + angka1);
        }
    }
}
