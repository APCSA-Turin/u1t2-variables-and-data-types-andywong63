/* Program purpose:
   - Compare two numbers to see if one is greater
   - Modify the first number and compare the new numbers */
public class Unit1Topic2 {
    public static void main(String[] args) {
        // Texts
        final String GREATER_TEXT = "The first number is greater than the second number";
        final String NOT_GREATER_TEXT = "The first number is not greater than the second number";
        // Numbers
        double firstNumber = 81;
        double secondNumber = 15 * 2;
        int thirdNumber;
        boolean firstNumGreater = firstNumber > secondNumber;
        // Display the numbers
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        if (firstNumGreater) {
            System.out.println(GREATER_TEXT); // First number is greater than second
        } else {
            System.out.println(NOT_GREATER_TEXT); // First number is less or equal to second
        }
        // Modify first number
        thirdNumber = 3;
        firstNumber = firstNumber / thirdNumber;
        System.out.println("New first number: " + firstNumber);
        // Compare the numbers again
        firstNumGreater = firstNumber > secondNumber;
        if (firstNumGreater) {
            System.out.println(GREATER_TEXT);
        } else {
            System.out.println(NOT_GREATER_TEXT);
        }
    }
}