import java.util.*;

class learnings_set {
    public static void main(String[] args) {
        // Creating a Set of integers
        Set<Integer> numbers = new HashSet<Integer>();
        
        // Adding elements to the set
        numbers.add(5);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        // Displaying the elements of the set
        System.out.println("Elements of the set: ");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
