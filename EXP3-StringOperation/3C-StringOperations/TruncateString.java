/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate() */

public class TruncateString {
    public static String truncate(String str, int length) {
        return str.length() <= length ? str : str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        System.out.println("Q7: truncate: " + truncate("This sentence is going to Truncate", 10));
    }
}
