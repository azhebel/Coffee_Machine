import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ordered = true;
        boolean asc = true;

        int a = scanner.nextInt();

        while (a != 0) {
            int prev = a;
            a = scanner.nextInt();

            if (a == 0) break;

            if (prev == a) continue;

            if (prev > a) {
                asc = false;
            }

            while (ordered) {
                prev = a;
                a = scanner.nextInt();
                if (a == 0) break;
                if ((prev > a && asc) || (prev < a && !asc)) {
                    ordered = false;
                }
            }

            break;
        }

        System.out.println(ordered ? "true" : "false");
    }
}