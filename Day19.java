
import java.util.Scanner;

public class Day19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai Anda :");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60) {
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("Nilai Anda E");

        }

    }
}
