import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int count = 0;

        while (m < k) {
            count++;
            m = m + m * p / 100;
        }

        System.out.println(count);
    }
}