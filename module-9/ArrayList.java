import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("JavaScript");
        words.add("Ruby");
        words.add("Swift");
        words.add("Kotlin");
        words.add("Go");
        words.add("Rust");
        words.add("Perl");

        // Display all elements using for-each loop
        System.out.println("ArrayList contents:");
        for (String word : words) {
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the element you want to see again: ");

        try {
            // Use Auto-Unboxing: converting from String to Integer
            String input = scanner.nextLine();
            int index = Integer.parseInt(input);  // Auto-unboxing from Integer to int

            String selected = words.get(index);
            System.out.println("Element at index " + index + ": " + selected);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        scanner.close();
    }
}
