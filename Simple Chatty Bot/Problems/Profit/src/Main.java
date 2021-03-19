import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double percentageIncreased = scanner.nextDouble();
        double yearlyIncrease = (percentageIncreased / 100) + 1;
        double finalAmount = scanner.nextDouble();
        int yearsTaken = 0;

        while (money < finalAmount) {
            money = (money * yearlyIncrease);
            yearsTaken++;
        }

        System.out.println(yearsTaken);

    }
}