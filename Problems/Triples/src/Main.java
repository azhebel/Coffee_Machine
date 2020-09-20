import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arrSize = s.nextInt();
        int[] array = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            array[i] = s.nextInt();
        }

        int numOfTriples = 0;

        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] == 1 && array[i - 1] - array[i - 2] == 1) {
                numOfTriples++;
            }
        }

        System.out.println(numOfTriples);
    }
}