import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMa {

    public static void main(String[] args) {

        // Create a HashMap with key-value pairs
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 78);
        System.out.println("HashMap (student grades): " + studentGrades);

        // Get the value for a specific key
        Integer aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's grade: " + aliceGrade);

        // Check if a key exists
        boolean hasBob = studentGrades.containsKey("Bob");
        System.out.println("Does the map contain 'Bob': " + hasBob);

        // Check if a value exists
        boolean hasGrade85 = studentGrades.containsValue(85);
        System.out.println("Does the map contain a grade of 85: " + hasGrade85);

        // Put a new key-value pair (updates existing if key already present)
        studentGrades.put("David", 95);
        System.out.println("HashMap after adding David: " + studentGrades);

        // Remove a key-value pair
        studentGrades.remove("Charlie");
        System.out.println("HashMap after removing Charlie: " + studentGrades);

        // Get the size of the HashMap (number of key-value pairs)
        int mapSize = studentGrades.size();
        System.out.println("Size of the HashMap: " + mapSize);

        // Iterate through the key-value pairs (Set view of keys)
        System.out.println("Students and their grades (using keySet):");
        for (String student : studentGrades.keySet()) {
            System.out.println(student + ": " + studentGrades.get(student));
        }

        // Iterate through the key-value pairs (Entry Set view)
        System.out.println("Students and their grades (using entrySet):");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clear the entire HashMap
        studentGrades.clear();
        System.out.println("HashMap after clearing: " + studentGrades);
    }
}
