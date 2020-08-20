import java.util.Scanner;


public class FullPalindrome {
	// Instance variables
		private String Candidate;
		private String Log;
		
		public static void main() 										// Console driver
	    {
			// Input using console
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a word or phrase: ");

	        // Takes input from the keyboard
	        String name = sc.nextLine();

	        // Evaluate by all methods
			FullPalindrome test = new FullPalindrome();
			test.setPaliCandidate(name);
	        test.isPali(1);
	        test.isPali(2);
	        test.isPali(3);
	    }
		
		public static String isPaliLog(String candidate, int method)	// Business logic driver
	    {
			// Tests candidate and returns result message
			FullPalindrome test = new FullPalindrome();
			test.setPaliCandidate(candidate);
	        test.isPali(method);
	        return test.getPaliLog();
	    }
		
		public String getPaliCandidate() {
			// Getter
			return Candidate;
		}
		
		public String getPaliLog() {
			// Getter
			return Log;
		}
		
		private void setPaliCandidate(String candidate) {
			// Setter
			Candidate = candidate;
		}
		
		private void setPaliLog(String log) {
			// Setter
			Log = log;
		}
		
		private void setPaliLog(boolean isPali, String method)
	    {
	    	// Log to persist in Object
			this.setPaliLog( String.format ("\"%s\"  %s  %s",
				Candidate,
				isPali 
				? "Is pali :)" 
				: "Not pali :(",
				method
				) );
	        System.out.println( this.getPaliLog() );
	    }
		
		private boolean isPali(int method) 
		{
			// Base condition, no need to test 0 or 1 condition
			if (Candidate.length() < 2) {
	    		this.setPaliLog(Candidate +" is to small to test");
				return true;
			}
			
			// Select testing method
			switch (method) {
			case 1:
				return palindromeTestIJ();
			case 2:
				//return palindromeRecurseDriver();
				return palindromeSubstring();
			case 3:
				//return palindromeSubstring();
				return palindromeRecurseDriver();
			default:
	    		this.setPaliLog(Candidate +" not run " + method + " unkown");
	    		return false;
			}

		}

		private boolean palindromeSubstring()
		{
			/// Entering Replace (Built-in) method
	        String msg = "Substring method";
	        
	        System.out.println( String.format("\n%s, Candidate: \"%s\",  Length = %d" ,msg, Candidate, Candidate.length()) );
	    	//int step = 0;

	        int startPosition = 0;
	       
	        String pal = Candidate.replaceAll("[^A-Za-z]+", "").toLowerCase();
	        
	        int endPosition = pal.length() - 1;
	        while (startPosition < endPosition)
	        {
	            //gets the first letter of the word
	            String firstLetter = pal.substring(startPosition, startPosition + 1);
	            //gets the last letter of the word
	            String lastLetter = pal.substring(endPosition, endPosition + 1);
	            
	            if (!firstLetter.equals(lastLetter))
	            {
	            	setPaliLog(false, msg);
	            	return false;
	            }
	            
	            //moves the pointer on the first letter forward
	            startPosition++;
	            //moves the pointer on the last letter back
	            endPosition--;
	            //trying to get to the middle
	            
	            firstLetter = pal.substring(startPosition, startPosition + 1);
	            lastLetter = pal.substring(endPosition, endPosition + 1);
	            
	            if(firstLetter.equals(lastLetter) && (endPosition - startPosition <= 1))
	            {
		            setPaliLog(true, msg);
	            return true;

	            
	            }
	            
	            
	        
	        }
	        if(!(startPosition < endPosition))
	        {
	        	setPaliLog(false, msg);
	        	return false;
	            
	        }
	        
	        else
	        {
	        	setPaliLog(false, msg);
	        	return false;
	        }
	        
	        
		}

		private boolean palindromeTestIJ()
		//second IJ method (using charAt) 
		//AP Exam does not allow usage of this method, because it has charAt.
	    {	
			// Entering IJ method
	        String msg = "IJ method";
	        System.out.println( String.format("\n%s, Candidate: \"%s\",  Length = %d" ,msg, Candidate, Candidate.length()) );
	        
	    	
	        String userWord = Candidate.replaceAll("[^A-Za-z]+", "").toLowerCase();
	        
	        int i = 0;
	        int j = userWord.length() - 1;
	        
	        while (i < j)
	        {
	            if(userWord.charAt(i) != userWord.charAt(j))
	            {setPaliLog(false, msg);
	            //i++; j--;
	            return false;
	            }
	        
	            else {
	            	i++;j--;
	            	//setPaliLog(true, msg);
	            	//return true; 
	            }
		         
	        }
	        setPaliLog(true,msg);
	        return true;
	    }
	    
		
		private boolean palindromeRecurseDriver()
	    {	
	        // Recursion driver,  used to setup recursion method
			String msg = "Recursion method";
	        System.out.println( String.format("\n%s, Candidate: \"%s\",  Length = %d" ,msg, Candidate, Candidate.length()) );

	        String testStr = Candidate;
			System.out.println(testStr)	;
	        boolean result = palindromeTestRecurse(testStr);
			
	        if (result) {
				setPaliLog(true, msg);
			} else {
				setPaliLog(false, msg);
			}
			
			return result;
	        
	        
	    }
	        
	        
	    
		
		private boolean palindromeTestRecurse(/*String shrinker, int step*/ String functionWord/*, int start, int end*/)
		{
			
			String myWord = functionWord.replaceAll("[^A-Za-z]+", "").toLowerCase();
			System.out.println(myWord);
	        
			int startLetter = 0;
	        //start = startLetter;
	        
	        int endLetter = myWord.length()-1;
	        //end = endLetter;
	        
	        if((endLetter - startLetter) < 1)
	        {
	        	//setPaliLog(true, msg);
	        	return true;
	        }

	        else if(myWord.charAt(startLetter) == myWord.charAt(endLetter))
	        {
	            
	        	//return palindromeTestRecurse(myWord, startLetter+1, endLetter-1);
	        	return palindromeTestRecurse(myWord.substring(startLetter+1, endLetter));
	        
	        }
	        //setPaliLog(false, msg);
	        return false;
		}
		
		public static void main(String[] args) 						// Console driver
	    {
			// Input using console
			Scanner scan = new Scanner(System.in); 
			System.out.println("Enter a word or phrase");
	        String candidate = scan.nextLine();

	        // Evaluate by all methods
	        FullPalindrome test = new FullPalindrome();
			test.setPaliCandidate(candidate);
	        test.isPali(1);
	        test.isPali(2);
	        test.isPali(3);
	    }
}
