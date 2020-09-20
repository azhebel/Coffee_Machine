import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int num = 1;

        while (count <= n) {
            for (int i = 0; i < num; i++) {
                if (++count > n) break;
                System.out.print(num + " ");
            }
            num++;
        }
    }
}