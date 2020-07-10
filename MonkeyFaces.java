/*
Creator: Nighthawk Coding Society Technical Developers
Mini Lab Name: Monkey Jumpers
Level: Easy
*/

/*
How to build Monkey Jumper rhyme in code
1. Build the entire rhyme Ten to One monkey in countdown, see sample
2. Look at and learn about variable assignments
3. Study loops and zero based counting
4. The challenge is to understand 2-dimensional arrays assignment and referencing elements
*/

public class MonkeyFaces {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countdown();

	}

	public static void countdown()
	{
		
		//Basic program shows print statement of a concatenation of strings with a tab to uniform spacing
		System.out.println("Begin Sample");
		System.out.println("4 little monkeys jumping on the bed...");
		System.out.println("ʕง ͠° ͟ل͜ ͡°)ʔ"  + "\t" + "ʕ༼ ◕_◕ ༽ʔ" + "\t" + "         ʕ(▀ ⍡ ▀)ʔ"+ "\t" + "ʕ ͡° ͜ʖ ° ͡ʔ");
		System.out.println("  \\_⏄_/  "  + "\t"+" \\_⎏_/  " + "\t" + "  \\_⎐_/ " + "\t" + "  \\_⍾_/  ");
		System.out.println("  --0--   " + "\t" + " ++1++  " + "\t" + "  <-2-> " + "\t" + "  ==3==  ");
		System.out.println("         ⎛   ⎞   " + "\t" + "                            ⌋ ⌊   " + "\t" +  "                         〈  〉  " + "\t" + "          _/ \\_  ");
		System.out.println("End Sample");
		
		/*
		Setup 10 monkeys in the monkey array, be creative
		Lookup and learn about ascii and unicode 
		a lot of ascii is on keyboard
		for unicode press control-command-space on Mac */

		String[][] monkeys = {
			{
		        "ʕง ͠° ͟ل͜ ͡°)ʔ",
		        "  \\_⏄_/  ",
		        "  --0--   ",
		        "          ⎛   ⎞   "},
			{
		        " ʕ༼ ◕_◕ ༽ʔ",
		        "  \\_⎏_/  ",
		        "  ++1++  ",
		        "          ⌋ ⌊   "},
			{
		        " ʕ(▀ ⍡ ▀)ʔ",
		        "  \\_⎐_/ ",
		        "  <-2-> ",
		        "        〈  〉 "},
			{
		        "ʕ ͡° ͜ʖ ° ͡ʔ",
		        "  \\_⍾_/  ",
		        "  ==3==  ",
		        "  _/ \\_  "},
			{
		        "(◕‿◕✿)",
		        "  \\_⍾_/  ",
		        "  ==4==  ",
		        "  _/ \\_  "},
		
		};
		
		/*
		loop pull first element out of each slot
		logic 0,0, 0,1, 0,2, 0,3, 1,0, 1,1, 1,2, 1,3, 2,0, 2,1, 2,2, 2,3, ....
		*/
		
		//begin the poem
		System.out.println();
		System.out.println("Monkey Jumpers Poem in Java");
		
		int num = 0;
		
		int monkeyCount = monkeys.length;        //how many monkeys do we have defined above? (logical rows)
		for (int i = monkeyCount; i >= 1; i--)   //loop through logic of code according to the monkey count
		{  	
			
			//this print statement shows current count of Monkeys
		    //   Two key concepts:
		    //   1. A concatenation (+) of the loop variable and string to form a countdown message
		    System.out.println(i + " little monkeys jumping on the bed...");
		
		    //how many separate parts are there in a monkey monkey? (logical columns)
		   
			for (int row = 0; row < monkeyCount; row++)  //cycles through rows of 2d array 
			{ 
		        
				/*cycles through columns to print 
				each monkey part by part, will eventually print entire column*/
				for (int col = 0; col < monkeys[row].length; col++) 
					
		        {
				
					// prints specific part of the monkey from the column 
		            System.out.print(monkeys[row][col] + " ");
		            
		            //this is new line between separate parts
		            System.out.println();
		        }
		    
				//this new line gives separation between stanza of poem
			    System.out.println();
			}
		    
			//countdown for poem, changes output and loop control by decrementing monkeyCount variable
		    monkeyCount -= 1;
		}
		
		//out of all the loops, prints finishing messages
		System.out.println("No more monkeys jumping on the bed");
		System.out.println("0000000000000000000000000000000000");
		System.out.println("             THE END              ");
	}
	
	//testing

}
