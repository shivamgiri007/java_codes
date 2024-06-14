import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorfile {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Get the iterator
        Iterator<String> colorIterator = colors.iterator();

        // Check if there's a next element (before using next())
        while (colorIterator.hasNext()) {
            String color = colorIterator.next();
            System.out.println("Color: " + color);

            // **Note:** Removing element using iterator.remove() is allowed here
            // However, removing using the original list (colors.remove()) during iteration might cause issues (ConcurrentModificationException).
            if (color.equals("Green")) {
                colorIterator.remove(); // Remove the element "Green" using iterator
            }
        }

        System.out.println("Colors after removing Green using iterator: " + colors);
    }
}
