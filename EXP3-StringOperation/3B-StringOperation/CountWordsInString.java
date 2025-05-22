/*Q2. Write a Java Program for Counting the number of words in a string using user defined function
countWords()
*/

public class CountWordsInString {

    // User-defined method to check if string is null or empty
    public static boolean isNullEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static int countWords(String str) {
        if (isNullEmpty(str))
            return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println("countWords: " + countWords("Welcome to Alvas"));
    }
}
