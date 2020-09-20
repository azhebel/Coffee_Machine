import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int first = number/100;
        int second = number%100/10;
        int third = number%10;

        int reverseNumber = third * 100 + second * 10 + first;

        System.out.println(reverseNumber);
    }
}