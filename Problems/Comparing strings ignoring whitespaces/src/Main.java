import java.util.Scanner;

class Main {

    public static boolean compareString(String input1, String input2) {
        String input1NoSpaces = input1.replace(" ", "");
        String input2NoSpaces = input2.replace(" ", "");
        return input1NoSpaces.equals(input2NoSpaces);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        System.out.println(compareString(input1, input2));
    }
}