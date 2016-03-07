public class Java {


    public static void main(String[] args) {
        
        // Declare and create array of (references to) strings.
        String[] words = new String[3];
        // array is an object like string
        
        // Set the array elements (point the references at strings)
        // initialize an array
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";
        
        // Access an array element and print it.
        System.out.println(words[2]);
        
        // Simultaneously declare and initialize an array of strings
        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        
        // Iterate through an array 
        // (normal) for loop ile array hem print edilebilir hem de initialize/assign edilebilirdi
        // enhanced for loop ile sadece iterate ediliyor (?)
        for(String fruit: fruits) {
            System.out.println(fruit);
            System.out.println(fruit.length());
        }
        
        // "Default" value for an integer
        int value = 0;
        
        // Default value for an object reference is "null"
        String text = null;
        
        System.out.println(text);
        
        // Declare an array of strings
        String[] texts = new String[2];
        
        // The references to strings in the array
        // are initialized to null.
        System.out.println(texts[0]);
        
        // ... But of course we can set them to actual strings.
        texts[0] = "one";
    }

}
/*
you
apple
5
banana
6
pear
4
kiwi
4
null
null
*/