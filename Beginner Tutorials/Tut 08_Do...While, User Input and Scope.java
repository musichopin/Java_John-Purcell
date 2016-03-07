import java.util.Scanner;

public class Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        /*
  		int value = 0;
        
        while(value != 5) {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        */
        
        int value = 0; // starting point
        
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt(); // change 
            // 1- "int value" denseydi int value = 0; ı etkilemeyecekti ve kendi scope'unda farklı bir variable olacaktı
            // 2- int value = 0; yazılmasaydı ve int value = scanner.nextInt(); denseydi 
            // value != 5'ı etkilemeyeceğinden hata verecekti
        }
        while(value != 5); // condition
        
        System.out.println("Got 5!");
    }

}
/*
Enter a number: 

// 1 entered

Enter a number:  

// 5 entered

Got 5!
 */
