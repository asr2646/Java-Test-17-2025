import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter visa status (valid/invalid): ");
        String visaStatus = sc.next().toLowerCase();

        if (age < 0) {
            System.out.println("Invalid age entered!");
        } else if (age < 18) {
            System.out.println("You must be 18 or older to travel.");
        } else if (!visaStatus.equals("valid")) {
            System.out.println("You cannot travel because your visa is invalid.");
        } else {
            System.out.println("✅ You are eligible to travel!");
        }
    }
}
