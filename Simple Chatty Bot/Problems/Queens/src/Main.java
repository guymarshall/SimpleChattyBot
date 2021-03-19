import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextByte();
        int y1 = scanner.nextByte();
        int x2 = scanner.nextByte();
        int y2 = scanner.nextByte();
        boolean sameRow = y1 == y2;
        boolean sameColumn = x1 == x2;
        boolean canAttack;

        if (sameRow || sameColumn) {
            canAttack = true;
        } else {
            canAttack = Math.abs(x1 - x2) == Math.abs(y1 - y2);
        }
        System.out.println(canAttack ? "YES" : "NO");

    }
}
