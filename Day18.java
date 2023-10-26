
import java.util.Scanner;

public class Day18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur anda : ");
        int umur = input.nextInt();

        if (umur <= 15 && umur >= 1) {
            System.out.println("Kamu masih anak-anak");
        }
        else if (umur >= 18 && umur <= 35) {
            System.out.println("Kamu sudah dewasa");
        } else {
            System.out.println("Kamu sudah tua");
        }
    }
}
