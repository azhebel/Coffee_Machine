import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();

        boolean hit = Math.abs(x2-x1) == Math.abs(y2-y1) || x2 - x1 == 0 || y2 - y1 ==0;

        if (hit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}