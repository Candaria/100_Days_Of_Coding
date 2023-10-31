
import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Masukkan Gaji pokok :");
        double gajipokok = input.nextDouble();

        System.out.println("Masukkan lama lembur :");
        double lamalembur = input.nextDouble();

        int gajilemburperjam = 55000;

        double gajilembur = lamalembur * gajilemburperjam;
        double gajibersih = gajipokok + gajilembur;

        double pajak = 0;
        if (gajibersih > 500000) {
            pajak = gajibersih * 5 / 100;
        }

        double gajisetelahpajak = gajibersih - pajak;
        System.out.println("Gaji bersih :" + gajibersih);
        System.out.println("Gaji setelah pajak " + gajisetelahpajak);
    }
}
