public class App {

    public static void main(String[] args) {
        int value = 5;
    	
        // E.g. 4! = 4*3*2*1 (factorial 4)
        System.out.println(factorial(value));
        
        System.out.println(value);
        // this variable value is different from the lower one 
        // (ikisi de int olarak tanýmlanmýþ)
        
        System.out.println(example());
    }
    
	// made the method static so that it can be directly called in main method
    private static int factorial(int value) {
        
        if(value == 0) {
            return 1; // value = 1 denemez
        }
        
        // recursive methods call themselves
        return factorial(value - 1) * value;
    }
    
 private static int example() {
        int value = 4;
        if (value == 4) {
            return 1; // value=1 ile ayný
        }
		return value;
    }

}