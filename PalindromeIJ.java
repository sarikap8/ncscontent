import java.lang.String.*;
import java.util.Scanner;
public class PalindromeIJ {
    public static void checkPal() {
        //converts string into all lowercase no spaces or special characters.
    	Scanner scan = new Scanner(System.in); 
    	System.out.println("Welcome! Please input a string to check");
        String input = scan.nextLine(); 
        input = input.toLowerCase();
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        // checks for no single characters
        while (input.length() == 1) {
        	System.out.println("Palindromes cannot be taken from single characters, try again");
            input = scan.nextLine(); 
        }
        // initializes variables to check array
        double length = input.length(); 
        char[] inputChars = input.toCharArray();
        boolean match = false; 
        int start = 0; 
        int end = (int)length-1; 
        // if start == end then there are an odd number of characters in the array, 
        // and if start > end there are an even number. 
        while (start <= end) {
            if (inputChars[start] == inputChars[end]) { 
                match = true;
                start++; end--;
                // boolean match determines if it is a palindrome or not.
            }
            else {
                match = false;
                break;
            }
        }
        // prints result based on value of match 
        if (match == true) {
            System.out.println("this is a palindrome");
        }
        else {
        	System.out.println("not a palindrome");
        }
    }
}