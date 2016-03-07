import java.util.HashMap;
import java.util.Map;

public class App {


    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        // HashMap stores pairs of values where one member is key and other is value
        
        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");
        
        String text = map.get(6);
        
        System.out.println(text);
        
        String text2 = map.get(1); // a key that doesn't exist
        
        System.out.println(text2);
        
        // if we have same key we would override the value
        // we can have same value corresponding two different keys
        
        System.out.println();
        
        // we are iterating though the map
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            
            // hashmap doesn't maintain order
            System.out.println(key + ": " + value);
            
            /*
            // alternative way to print :
			for(int i : map.KeySet())
			System.out.println(i + " : " + map.get(i));
            */
        }
        
    }

}

/*
Six
null

2: Two
4: Four
5: Five
6: Six
8: Eight
*/