
import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Masukkan Gaji pokok :");
        double gajipokok = input.nextDouble();

        System.out.println("Masukkan lama lembur :");
        double lamalembur = input.nextDouble();

        int gajilemburperjam = 55000;

        double gajilembur = lamalembur * gajilemburperjam;
        double gajibersih = gajipokok + gajilembur;

        System.out.println("Gaji bersih :" + gajibersih);

    }
}
