/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		Integer random_number1 = (int) (Math.random() * 10);
		String random_numbers = "" + random_number1;
		Integer random_number2 = (int) (Math.random() * 10);
		while (random_number1 <= random_number2){
			random_numbers=random_numbers + " " + random_number2;
			random_number1 = random_number2;
			random_number2 = (int) (Math.random() * 10);
		}
		System.out.println(random_numbers);
		
		
		}
	}



	