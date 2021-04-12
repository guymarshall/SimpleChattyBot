import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int startingIndex = scanner.nextInt();
        int finishingIndex = scanner.nextInt();

        System.out.println(word.substring(startingIndex, finishingIndex + 1));
    }
}