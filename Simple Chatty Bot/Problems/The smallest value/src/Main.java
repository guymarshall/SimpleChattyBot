import java.util.Scanner;

class Main {
    public static long factorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long userInput = scanner.nextLong();
        int number = 1;

        while (factorial(number) <= userInput) {
            number++;
        }

        System.out.println(number);
    }
}