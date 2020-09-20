import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            if (a == 0) break;
            System.out.println(a % 2 == 0 ? "even" : "odd");
        }
    }
}