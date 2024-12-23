import java.util.*;

class Arithmetic {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b values: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modular division");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum is " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division is " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Modular division is " + (a % b));
                } else {
                    System.out.println("Cannot perform modular division by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice.. Please try again");
        }
    }
}
OUTPUT:
       Enter a and b values: 
         10
         5
      1. Addition
      2. Subtraction
      3. Multiplication
      4. Division
      5. Modular division
      Enter your choice: 
       3
      Multiplication is 50
