import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        double hra = basicPay * 0.20;  // 20%
        double da = basicPay * 0.15;   // 15%
        double grossSalary = basicPay + hra + da;
        double tax = grossSalary * 0.10; // 10%
        double netSalary = grossSalary - tax;

        System.out.println("\n--- Salary Breakdown ---");
        System.out.println("Basic Pay: ₹" + basicPay);
        System.out.println("HRA (20%): ₹" + hra);
        System.out.println("DA (15%): ₹" + da);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax (10%): ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}
