/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		Integer number =Integer.parseInt(args[0]);
		Integer dividers_sum = 1;
		String perfect_output=number+" is a perfect number since "+number+" = 1";
		for (int i = 2 ; i < number ; i++){
			if (number % i == 0){
				dividers_sum = dividers_sum + i;
				perfect_output=perfect_output+" + "+i;
				// to many blank lines
				
			}
		}
		
		if ((int)dividers_sum == number){
			System.out.println(perfect_output);
		}
		else{
			System.out.println(number+" is not a perfect number");
		}
	}
}
