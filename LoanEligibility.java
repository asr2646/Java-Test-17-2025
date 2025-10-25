import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();

        // Validation
        if (age <= 0 || age < 18 || age > 80) {
            System.out.println("Invalid or ineligible age. Must be between 18 and 80.");
        } else if (salary <= 0 || salary < 30000) {
            System.out.println("Ineligible due to low salary. Minimum required is ₹30,000.");
        } else if (creditScore <= 0 || creditScore < 650 || creditScore >= 850) {
            System.out.println("Ineligible due to poor or invalid credit score. Must be between 650 and 850.");
        } else {
            System.out.println("✅ Congratulations! You are eligible for a loan.");
        }
    }
}
