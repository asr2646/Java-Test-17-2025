public class WhileLoopSum {
    public static void main(String[] args) {

        int i = 1;   // initialization
        int sum = 0; // variable to store sum

        while (i <= 10) {  // condition
            sum = sum + i; // add current number
            i++;           // increment
        }

        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}
