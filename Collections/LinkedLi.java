import java.util.LinkedList;

public class LinkedLi {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Linked List after adding elements: " + fruits);

        // Access elements by index (careful with out-of-bounds)
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Add element at a specific position
        fruits.add(1, "Mango");
        System.out.println("Linked List after adding at index 1: " + fruits);

        // Remove the first element
        String removedFruit = fruits.removeFirst();
        System.out.println("Removed first fruit: " + removedFruit);
        System.out.println("Linked List after removing first: " + fruits);

        // Remove the last element
        removedFruit = fruits.removeLast();
        System.out.println("Removed last fruit: " + removedFruit);
        System.out.println("Linked List after removing last: " + fruits);

        // Check if an element exists
        boolean hasOrange = fruits.contains("Orange");
        System.out.println("Does the list contain 'Orange': " + hasOrange);

        // Iterate through the list using for-each loop
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Find the index of an element
        int mangoIndex = fruits.indexOf("Mango");
        System.out.println("Index of 'Mango': " + mangoIndex);

        // Clear the entire list
        fruits.clear();
        System.out.println("Linked List after clearing: " + fruits);
    }
}
