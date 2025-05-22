/* 
Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()
*/

import java.util.Random;

public class RandomString {
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("generateRandomString: " + generateRandomString(8));
    }
}
