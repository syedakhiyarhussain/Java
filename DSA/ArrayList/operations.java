import java.util.ArrayList;
public class operations {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // add elements to the ArrayList ,T.C=O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("ArrayList: " + list);
        //add at particular index
        list.add(1, 5);
        System.out.println("ArrayList after adding 5 at index 1: " + list);
        //Get element at index 1 ,T.C=O(1)
        int element=list.get(2);
        System.out.println("Element at index 2: " + element);
        //Remove element at index 0 ,T.C=O(n)
        list.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + list);
        //Update element at index 0 ,T.C=O(n)
        list.set(0, 10);
        System.out.println("ArrayList after updating element at index 0: " + list);
        //contains method ,T.C=O(n)
        boolean containsElement=list.contains(10);
        System.out.println("ArrayList contains 10: " + containsElement);
        //size method
        int size=list.size();
        System.out.println("Size of ArrayList: " + size);
    }
    
}
