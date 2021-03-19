import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.print(userInput + " ");

        while (userInput != 1) {
            if (userInput % 2 == 0) {
                userInput = userInput / 2;
                System.out.print(userInput + " ");
            } else if (userInput % 2 == 1) {
                userInput = userInput * 3 + 1;
                System.out.print(userInput + " ");
            }
        }
    }
}