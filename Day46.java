
import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = sc.nextInt();

        if (nilai >= 60) {
            System.out.println("Selamat, Anda lolos!");

            System.out.println("Lanjut ke tahap selanjutnya...");
        } else {
            System.out.println("Maaf, Anda belum lolos. Coba lagi.");
        }

        sc.close();
    }
}
