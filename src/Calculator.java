import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    private static Calculator single_instance = null;
    private Scanner scanner = new Scanner(System.in);
    
    
    private Calculator() {
        menu();
    }

    /**
     * Make sure only one instance can be run at a time.
     * @return a new instance of the program.
     */
    public static Calculator Calculator() {
        if (single_instance == null ) {
            single_instance = new Calculator();
        }
        return single_instance;
    }

    private void menu() {
        System.out.println("Minimal Calculator");
        while ( true ) {
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            while ( !scanner.hasNextInt()) {
                System.out.println("That is not a number");
                scanner.next();
            }
            Integer choice = scanner.nextInt();
            switch ( choice ) {
                case 1:
                    addition();
                    return;
                case 2:
                    subtraction();
                    return;
                case 3:
                    multiplication();
                    return;
                case 4:
                    division();
                    return;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid value");
                    menu();
            }
        }
    }

    private void division() {
        Division division = new Division();
        int[] numbers = getNumbers();
        division.division(numbers);
        menu();
    }

    private void multiplication() {
        Multiplication multiplication = new Multiplication();
        int[] numbers = getNumbers();
        multiplication.multiply(numbers);
        menu();
    }

    private void subtraction() {
        Subtraction subtraction = new Subtraction();
        int[] numbers = getNumbers();
        subtraction.subtract(numbers);
        menu();
    }

    private void addition() {
        Addition addition = new Addition();
        int[] numbers = getNumbers();
        addition.add(numbers);
        menu();
    }

    private int[] getNumbers() {
        System.out.println("Enter the numbers you want calculated. Separate them with a blank space.");
        int choice[] = null;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            choice = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

        return choice;
    }
}
