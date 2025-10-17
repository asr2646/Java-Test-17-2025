import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000; // Initial balance

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount! Enter a positive value.");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be a multiple of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}
