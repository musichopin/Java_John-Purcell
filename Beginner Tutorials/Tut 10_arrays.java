public class Java {
    public static void main(String[] args) {
        
        int value = 7;
        
        int[] values; // declares an array variable
        values = new int[3]; // creating an array with new kw
        
        System.out.println(values[0]);
        
        values[0] = 10; // initializing (first assignment) values for the array
        values[1] = 20;
        values[2] = 30;
        
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        
        for(int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        
        int[] numbers = {5, 6, 7};
        
        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
/*
0
10
20
30
10
20
30
5
6
7
*/
