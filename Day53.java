
import java.util.Scanner;

public class Day53 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan batas Angka :");
        int Batas = input.nextInt();

        System.out.println("===Mencetak kelipatan 3===");
        int jumlah = 0;

        for (int i = 1; i < Batas; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                jumlah++;
            }
        }
        System.out.println("jumlah kelipatan 3 adalah :" + jumlah);
    }
}
