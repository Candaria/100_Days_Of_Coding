
import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);

        System.out.println("Masukkan nilai1 : ");
        int nilai1 = nilai.nextInt();

        if (nilai1 > 5) {
            System.out.println("Nilai lebih besar dari 5");

        } else {
            System.out.println("Nilai kurang dari atau sama dengan 5");
        }
    }
}
