
import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = sc.nextInt();

        if (nilai >= 80) {
            System.out.println("Selamat, Anda lulus dengan predikat 'A'!");
        } else if (nilai >= 70) {
            System.out.println("Anda lulus dengan predikat 'B'.");
        } else if (nilai >= 60) {
            System.out.println("Anda lulus dengan predikat 'C'.");
        } else {
            System.out.println("Maaf, Anda belum lulus. Coba lagi.");
        }

        sc.close();
    }
}
