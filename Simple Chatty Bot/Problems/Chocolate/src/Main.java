import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int area = length * width;
        int removed = scanner.nextInt();
        int remaining = area - removed;

        //System.out.println(removed / 2 - 1 == width || removed / 2 - 1 == length ? "YES" : "NO");
        //System.out.println(removed != length - 1 || removed != width - 1);
        //System.out.println(area - removed == length || area - removed == width ? "YES" : "NO");
        System.out.println((remaining % length == 0 || remaining % width == 0) && !(removed / length > width) 
            && !(removed / width > length) ? "YES" : "NO");
    }
}
