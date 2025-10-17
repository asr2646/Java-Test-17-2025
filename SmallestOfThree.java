import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int smallest;

            if (a <= b && a <= c)
                smallest = a;
            else if (b <= a && b <= c)
                smallest = b;
            else
                smallest = c;

            System.out.println("The smallest number is: " + smallest);
        }
    }
}
