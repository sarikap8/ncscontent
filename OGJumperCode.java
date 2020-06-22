//If not given by default, you may have to import packages to use tools like Scanner.
import java.util.Scanner; 
/* 
 * Objective: Learn how to properly iterate using a for loop, using if/else, using variables, 
 * and returning values in methods. 
 * 
 * Steps: 
 * 	1. Declare local variables for jumper type and amount. 
 * 	2. Iterate through loop and concantanate String appropriately depending on iteration 
 * 	using if/else logic 
 * 	3. Return appropriate string matching method header type 
 * 	4. Call method created inside of main method. 
 * 	5. Utilize scanner in main method to run method with custom name and number
 * 
 * Advanced optional assignment: using octals/binary instead of decimal numbers in countdown.
 */
public class OGJumperCode {
	public static String runTheSong(int input, String jumper) {
		//Declaring local variable of type integer and String equal to parameter values. 
		int number = input;
		String jumpers = jumper;
		
		// Println statements 
		// dummy read to allow flush new line
		System.out.println("Press enter");
		
		//concatenating String using + between Strings and variables. 
		System.out.println("Okay " + number + " " + jumpers + " will be used");
		String song = null;
		// Starts actual song (loop)
		
		//int i = number; i >= 0; i--
		for (//add for loop header to count down 1 jumper each time) {
			song = song + i + " little " + jumpers + " jumping on the bed" + "\n";
			if (i > 0) {
				song = song + "One fell off and broke its head";
				song = song + "Mama called the doctor and the doctor said";
				song = song + "No more " + jumpers + " jumping on the bed";
			} else {
				//Add a different line to the song when !(i>0) for the jumpers
				//song = song + "Mama is sad because her " + jumpers + " are all dead.";
			}
			System.out.println("");
		}
	//return String that will display the song	
	//return song;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		//you don't have to make an object because both method and main are static, 
		//more on this later
		runTheSong(scan.nextInt(), scan.nextLine()); 
	}
}