import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        int start = s1 + m1*60 + h1*3600;
        int end = s2 + m2*60 + h2*3600;

        int diff = end - start;

        System.out.println(diff);
    }
}