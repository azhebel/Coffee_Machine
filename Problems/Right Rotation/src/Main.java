import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] line = s.nextLine().split(" ");

        int[] array = new int[line.length];

        int r = s.nextInt();

        for (int i = 0; i < line.length; i++) {
            array[(i + r) % line.length] = Integer.parseInt(line[i]);
        }

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}