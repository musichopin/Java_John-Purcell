import java.util.Scanner; // import library

public class Java {
    public static void main(String[] args) {
        
        // Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Output the prompt
        System.out.println("Enter a floating point value: ");
        
        // Wait for the user to enter something.
        // next ile þimdiki input kastediliyor
        double value = input.nextDouble();
 
        
        // Tell them what they entered.
        System.out.println("You entered: " + value);
    }
}

/*
Enter a floating point value: 

// 1 entered

You entered: 1.0
*/
