
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		// we are randomizing two numbers between 0 and 1, when 0 is a boy, 1 is a girl
		boolean is_boy = false;
		boolean is_girl = false;
		int childrens=0;
		Integer gender;
	while (is_boy == false || is_girl == false) {
		gender=(int)(Math.random()*2);
		if (gender==0){
					is_boy=true;
					System.out.print("b ");
				}
				else{
					is_girl=true;
					System.out.print("g ");
				}
		
		childrens++;
	}
	System.out.println();
	System.out.println("You made it... and you now have "+childrens+" children.");
}
}
