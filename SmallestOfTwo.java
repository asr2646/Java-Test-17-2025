import java.util.Scanner;

public class SmallestOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int smallest = (a < b) ? a : b;

            System.out.println("The smallest number is: " + smallest);
        }
    }
}
