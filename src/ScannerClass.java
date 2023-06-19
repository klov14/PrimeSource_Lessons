import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type: ");
        int x = s.nextInt();
        System.out.println("You typed "+ x);
    }
}
