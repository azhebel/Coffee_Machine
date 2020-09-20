import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(string.substring(start, end+1));
    }
}