import java.util.ArrayList;

public class ArrayLi{

    public static void main(String[] args) {

        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList after adding elements: " + numbers);

        // Access elements by index (careful with out-of-bounds)
        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        // Add element at a specific position
        numbers.add(1, 15);
        System.out.println("ArrayList after adding at index 1: " + numbers);

        // Remove the element at a specific index
        int removedNumber = numbers.remove(2);  // Removes element at index 2 (which is 30)
        System.out.println("Removed number: " + removedNumber);
        System.out.println("ArrayList after removing at index 2: " + numbers);

        // Set the value of an element at a specific index
        numbers.set(0, 5);
        System.out.println("ArrayList after setting value at index 0: " + numbers);

        // Check if an element exists
        boolean hasTwenty = numbers.contains(20);
        System.out.println("Does the list contain 20: " + hasTwenty);

        // Iterate through the list using for-each loop
        System.out.println("Numbers in the list:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Find the index of an element
        int fifteenIndex = numbers.indexOf(15);
        System.out.println("Index of 15: " + fifteenIndex);

        // Clear the entire list
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}
