
// 6. Write a java program for getting different colors through ArrayList interface and delete nth
// element from the ArrayList object by using remove by index

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveByIndex {

    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Print the original list
        System.out.println("Original Color List: " + colors);

        // Input n from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (1-based) of the element to remove: ");
        int position = scanner.nextInt();

        // Convert to 0-based index
        int index = position - 1;

        // Check and remove if index is valid
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid position! No element removed.");
        }

        // Print the updated list
        System.out.println("Updated Color List: " + colors);

        scanner.close();
    }
}