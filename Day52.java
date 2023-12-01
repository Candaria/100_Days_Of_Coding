
public class Day52 {

    public static void main(String[] args) {

        System.out.println("===Mencetak kelipatan 3===");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }

        System.out.println("===Mencetak kelipatan 5===");

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
