import java.util.Scanner;

class Main {

    public static void isLeapYear(int year) {
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeapYear) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        isLeapYear(year);
    }
}