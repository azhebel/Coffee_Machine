import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arrSize = s.nextInt();

        int[] array = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            array[i] = s.nextInt();
        }

        int n = s.nextInt();

        int sum = 0;

        for (int i : array) {
            if (i > n) sum += i;
        }

        System.out.println(sum);
    }
}