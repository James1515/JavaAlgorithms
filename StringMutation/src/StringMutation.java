
public class StringMutation 
{
	//------------------------------------------------
	//Prints a string and various mutations of it.
	//------------------------------------------------

	public static void main(String[] args)
	{
		//Variable Declarations
		String phrase = "Change is inevitable";
		String mutation1, mutation2, mutation3, mutation4;
		
		//Displplays the original string:
		System.out.println("Original String: \"" + phrase + "\"");
		System.out.println("Length of String: " + phrase.length());
		
		//Mutations of the phrase:
		mutation1 = phrase.concat(", except from vending machines.");
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation2.replace('E', 'X');
		mutation4 = mutation3.substring(3, 30);
		
		//Prints each mutated string:
		System.out.println("Mutation #1: " + mutation1);
		System.out.println("Mutation #2: " + mutation2);
		System.out.println("Mutation #3: " + mutation3);
		System.out.println("Mutation #4: " + mutation4);
		
		System.out.println("Mutated Length: " + mutation4.length());
		

	}

}
