/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String input_str = args[0];
		Integer str_len = input_str.length();
		String reveresed="";
		for ( int i = str_len-1;i >= 0; i--){
			char current_char = input_str.charAt(i);
			reveresed = reveresed + current_char;

		}
		System.out.println(reveresed);
		System.out.println("The middle character is " + input_str.charAt((str_len-1)/2));


	}
}
