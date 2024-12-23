import java.util.*;

class Fact {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        a = sc.nextInt();
        
        int fact = 1;
        for (int i = 1; i <= a; i++) {  
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + a + " is " + fact);  
    }
}

OUTPUT:
        Enter the number:
           4
         Factorial of 4 is 24
