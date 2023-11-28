
import java.util.Scanner;

public class Day50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama :");
        String nama = sc.nextLine();

        System.out.println("Masukkan NIM :");
        String NIM = sc.nextLine();

        System.out.println("Masukkan tinggi badan :");
        double tinggi_bdn = sc.nextDouble();
        sc.nextLine();

        System.out.println("Masukkan ukuran baju :");
        char ukuran_bju = sc.nextLine().charAt(0);

        System.out.println("Masukkan status pernikahan :");
        boolean status_pernikahan = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Masukkan agama :");
        String Agama = sc.nextLine();

        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + NIM);
        System.out.println("Tinggi Badan :" + tinggi_bdn);
        System.out.println("Ukuran baju :" + ukuran_bju);
        System.out.println("status pernikahan :" + status_pernikahan);
        System.out.println("Agama :" + Agama);
    }
}
