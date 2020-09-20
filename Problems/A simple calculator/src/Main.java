import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n1 = scanner.nextLong();
        String ch = scanner.next();
        long n2 = scanner.nextLong();

        switch (ch) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(n1 / n2);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}