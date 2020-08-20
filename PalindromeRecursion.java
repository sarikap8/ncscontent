/**
 * Write a description of class palindrome3ways here.
 *
 * @author sarika
 * @version 1.0
 */
//usage in code review 
import java.io.*; 
import java.util.*; 
public class PalindromeRecursion
// AP Standard 6: Array (of characters)
// AP Standard 10: Recursion
{
int test = 0; 
    public static char[] isInputValid(String input) {
    	
        if ( input.length() == 1) {
            System.out.println("invalid try again"); 
            Scanner scan = new Scanner(System.in); 
            input = scan.nextLine(); 
        }
        
        input = input.toLowerCase();
        input = input.replaceAll("[^a-zA-Z0-9]", "");

        char[] array3 = input.toCharArray(); 
        return array3; 
    }

    public static void recursionPal() {
    	// AP Standard 6: Array (of characters)
    	// AP Standard 10: Recursion
    	
    	System.out.println("Please input a line that you would like to check!");
        Scanner scan = new Scanner(System.in); 
    	String input = scan.nextLine();
    	
        //char[] array = input.toCharArray(); 
        //isInputValid(input); 
    	
        char[] array = isInputValid(input); 
        
        //for (char a: array) {
           // consoleIO.outputString(a); 
        //}
        
        recursion(array,0, array.length-1);
    }

    public static boolean recursion(char[] array2, int start, int end) {
    	// AP Standard 6: Array (of characters)
    	// AP Standard 10: Recursion
        //consoleIO.outputString(end);
    	
        if (array2[start]!= array2[end]) {
            System.out.println("nope it is not a palindrome"); 
            return false;
        }
        
        if (end == 0) {
            System.out.println("yes it is a palindrome");
            return true; 
        }
        
        //consoleIO.outputString(start + ' ' + end); 
        return recursion(array2, start+1, end-1); 
    }
}