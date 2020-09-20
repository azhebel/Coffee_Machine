import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        boolean isPrime = true;

        for (int i = 2; i <= number /2; i++) {
            if (number % i == 0) {
                isPrime =false;
                break;
            }

        }

        return !isPrime;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}