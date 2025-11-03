public class WhileLoopEvenNumbers {
    public static void main(String[] args) {

        int i = 2;  // start from the first even number

        System.out.println("Even numbers from 1 to 20:");

        while (i <= 20) {
            System.out.println(i);
            i += 2;  // increment by 2 to get next even number
        }
    }
}
