/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		Integer number = Integer.parseInt(args[0]);
		int i = 0;
		while (i<number){
			int j = 0 ;
			while (j < number){
				if (i % 2 == 1 ){
				System.out.print(" *");
				}
				else{
					System.out.print("* ");
				}
				j++;

			}
			System.out.println("");
			i++;

		}

		

	}
}
