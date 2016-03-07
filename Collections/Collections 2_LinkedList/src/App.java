import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {


    public static void main(String[] args) {
        /*
         * ArrayLists manage arrays internally.
         * [0][1][2][3][4][5] ....
         */
        List<Integer> arrayList = new ArrayList<Integer>();
        // alt: ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        /*
         * LinkedLists consists of elements where each element
         * has a reference to the previous and next element
         * [0]->[1]->[2] ....
         *    <-   <-
         */
        List<Integer> linkedList = new LinkedList<Integer>();
        // alt: LinkedList<Integer> linkedList = new LinkedList<Integer>();
        
        // we should be using array list if we want to add or remove items from the end
        // we should be using linked list if we want to add or remove items from anywhere else
        // getting items from linked lists is slow
        // but timing only matters for huge size of lists
        // arraylist is default
        
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList" , linkedList);
    }
    
    // we wud be able to pass lists to the function/method
    // we wud pass anything that implements the list interface
    private static void doTimings(String type, List<Integer> list) {
        
        for(int i=0; i<1E5; i++) { // zaman yarýþý yapýlmadan evvel listeye 10000 eleman eklenmiþ
            list.add(i);
        }
        
        long start = System.currentTimeMillis();
        
        /*
        // Add items at end of list (longer for linkedlist)
        for(int i=0; i<1E5; i++) { // 1E5: hundred thousand
            list.add(i);
        }
        */
        
        // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
            list.add(0, i); // add items (i) at the beginning (0) of the list 
            // list.add(list.size() - 5, i); denseydi arraylist daha hýzlý olurdu
            // Each time you look up another element, the search starts again from the
            // beginning of the list. The LinkedList object makes no effort to cache the position information 
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
 
}
/*
Time taken: 3507 ms for ArrayList
Time taken: 11 ms for LinkedList
*/