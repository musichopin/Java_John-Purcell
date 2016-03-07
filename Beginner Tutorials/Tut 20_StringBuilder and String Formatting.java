public class Java {


    public static void main(String[] args) {
        
        // Inefficient, because we are creating a new string all the time
        String info = "";
        
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
        
        System.out.println(info);
        
        // More efficient in terms of memory.
        StringBuilder sb = new StringBuilder(""); 
        // StringBuilder object doesn't have to be initialized 
        
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
        // we are just modifying the contents of same stringbuilder object
        
        System.out.println(sb.toString());
        
        // The same as above, but nicer ....
        
        StringBuilder s = new StringBuilder();
        
        s.append("My name is Roger.")
        .append(" ")
        .append("I am a skydiver.");
        // same as: s.append("My name is Roger.").append(" ").append("I am a skydiver.");
        
        System.out.println(s.toString());
        
        ///// Formatting //////////////////////////////////
        
        // Outputting newlines and tabs
        System.out.print("Here is some text.tThat was a tab.nThat was a newline.");
        System.out.println(" More text.");
        
        // Formatting integers
        // %-10d means: output an integer in a space ten characters wide,
        // padding with space and left-aligning (%10d would right-align)
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
        // printf is gonna look for formatting characters on the left side (format string)
        // and for each formatting character it will look for an argument on the right side
                
        // so as to put a new line we use \n with printf
        
        // Demo-ing integer and string formatting control sequences
        for(int i=0; i<20; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }
        
        // Formatting floating point value
        
        // Two decimal place:
        System.out.printf("Total value: %.2f\n", 5.6874);
        
        // One decimal place, left-aligned in 6-character field:
        System.out.printf("Total value: %-6.1f\n", 343.23423);
        
        // You can also use the String.format() method if you want to retrieve
        // a formatted string.
        String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
        System.out.println(formatted);
        
        // Use double %% for outputting a % sign.
        System.out.printf("Giving it %d%% is physically impossible.", 100);
        
    }

}
/*
My name is Bob. I am a builder.
My name is Sue. I am a lion tamer.
My name is Roger. I am a skydiver.
Here is some text.tThat was a tab.nThat was a newline. More text.
Total cost 5         ; quantity is 120
0 : here is some text
1 : here is some text
2 : here is some text
3 : here is some text
4 : here is some text
5 : here is some text
6 : here is some text
7 : here is some text
8 : here is some text
9 : here is some text
10: here is some text
11: here is some text
12: here is some text
13: here is some text
14: here is some text
15: here is some text
16: here is some text
17: here is some text
18: here is some text
19: here is some text
Total value: 5.69
Total value: 343.2 
This is a floating-point value: 5,123
Giving it 100% is physically impossible.
*/