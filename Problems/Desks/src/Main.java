import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();

        int d1 = c1/2 + c1%2;
        int d2 = c2/2 + c2%2;
        int d3 = c3/2 + c3%2;

        int sum = d1 + d2 + d3;

        System.out.println(sum);
    }
}