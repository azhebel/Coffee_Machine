import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();

        System.out.print(--first);
        System.out.print(" ");
        System.out.print(--second);
        System.out.print(" ");
        System.out.print(--third);
        System.out.print(" ");
        System.out.print(--fourth);
    }
}