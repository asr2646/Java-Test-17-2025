import java.util.Scanner;

public class LargestOfThree {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            final int b = sc.nextInt();
            int c = sc.nextInt();

            int largest;

            if (a >= b && a >= c)
                largest = a;
            else if (b >= a && b >= c)
                largest = b;
            else
                largest = c;

            System.out.println("The largest number is: " + largest);
        }
    }
}
