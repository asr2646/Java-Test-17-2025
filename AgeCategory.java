import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age entered!");
        } else if (age <= 12) {
            System.out.println("Category: Child");
        } else if (age <= 19) {
            System.out.println("Category: Teenager");
        } else if (age <= 64) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior Citizen");
        }
    }
}
