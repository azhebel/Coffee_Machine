import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean crashed = false;

        for (int i = 1; i <= bridges; i++) {
            if (scanner.nextInt() <= height) {
                System.out.println("Will crash on bridge " + i);
                crashed = true;
                break;
            }
        }

        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}